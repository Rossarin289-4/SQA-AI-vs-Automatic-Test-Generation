package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483743"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "Q"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_throwInternal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "0x1,23456889", "<sample:4>"}, {"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"-0.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<s:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<d:7.6000000000000005>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1066912537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:-33554430>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "2", "2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<empty>", "2139094976", "-4106"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1213009734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<null>", "74", "4097"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#290326151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<null>", "-130049", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "long", "2305843009213693952"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#290326151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:'3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "-2046", "-2147483648", "262148"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=0, getHighestEscapedChar=127, get...#250#698401849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<null>", "-767", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "version", ""}}, 3), new String[][]{{"writeEmbeddedObject", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"a\t", "-1.7976931348623157E308"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "2147483647", "16777224"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-1073741833"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1}", "0"}}), new String[][]{{"writeArray", "long[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"LUSH_PARdSED", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,long", "\u00e9>", "-9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1511057053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<sample:1>", "-4097", "1025"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "6.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "534773744", "43"}, {"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "1074790397", "-2147483639", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "-65024"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,double", "0xFGeFFF/F", "-Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1051778687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"0x>FFFFEFF", "-3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeOmittedField", "java.lang.String", "0x1,2345689"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-1.7976931348623155E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#912835135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "{S\"a\":1}", "0.1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567", "-8388672"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String", "AUTO_CLOSE_TARGET"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "0x1,23456889010", "-0.1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"writeArray", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1455969602", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1455969602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<empty>", "33", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String", "ESCAPE_NON_AASCII"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", ")", "<i:-2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false), new String[][]{{"canOmitFields", "", "7"}, {"isClosed", "", "0"}, {"writeArray", "int[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1149291718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1149291718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setFeatureMask", "int", "33554432"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,float", "a\t", "-0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"1E-5Generator of type )"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1081309571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2010496439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483584", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}, {"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#1650232309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#1650232309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "1e1"}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportError", new String[]{"java.lang.String"}, new String[]{"2020-01-02"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-61>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteTypeId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportError", new String[]{"java.lang.String"}, new String[]{"0d12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:1>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "version", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "-4106", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "0101L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020-02-20T25:61:61", "-4106", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "flush", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:bd>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2084885209", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"18446744073709551616"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "1.ld"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-390915102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "int", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1693147801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"truf", "-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCharacterEscapes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:2>", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<i:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "getCharacterEscapes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"a b", "2147483647", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#739871523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483614", "2147483647"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportError", new String[]{"java.lang.String"}, new String[]{"nukl"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"32708"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483521"}, false, 0, null, 2), new String[][]{{"getPrettyPrinter", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483521, getFormatFeatures=0, getHighestEscapedChar=...#256#2027544901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"<-1a b"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String,int,int", "/a", "-1", "301989888"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "32767"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#1551045457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "1.1234567890"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0.10"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "aB,b,c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "10", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:-33554499>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setHighestNonEscapedChar", "int", "-1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "isClosed", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"AUTO_CLOSE_JON_CONTENT", "-1073741823", "-1073741824"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "-2130706432"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canOmitFields", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483593"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_throwInternal", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-389397564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "-4106", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "IGNORE_UNKNOWN1.1234567", "-33554484", "-10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"Titlf"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<sample:1>", "-24", "1073741823"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<s:bE>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "16777216", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "-1073741823", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"9223372036854767615"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String"}, new String[]{"WRITE_Generator of type "}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-84237218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"int"}, new String[]{"-2147483584"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"G"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678901234567+1", "32811"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"\t1.1234567", "false"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:6>", "33554484", "2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1213009734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "-1", "-2147483648"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#124581108", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#124581108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<d:-0.76>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "-47"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "10", "-4106"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "1e1", "-2147483648", "43"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,float", "1E-512345678901234567890123467890", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String"}, new String[]{".5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<i:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<b:false>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"-3.4028235E38"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1757307006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"28020-01-00"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483584"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canOmitFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canOmitFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1<a>b</a>", "2147483647", "4106"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canOmitFields", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"42"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_throwInternal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteFormattedNumbers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"31"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1", "5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.math.BigInteger", "2147614815"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-79007938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{"int"}, new String[]{"-2147483584"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "43", "65537"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-390915102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:y>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"30719"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1073741823", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "-1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"16386"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "Helo, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.8.3-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=8, getPatchLevel=3, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1786217638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"fITLE"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String,int,int", "11L", "0", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483743"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeOmittedField", "java.lang.String", "AUTO_CLOSE_JON_CONTENT"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,double", "true", "-0.8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1073741872"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "-2147483584", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#37154257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "canOmitFields", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-576460752303423445"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "0x1F[1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-2147483756"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "-1073741838", "-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"No current even to copy+1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#245#978292768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObject", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"0d12b;30:45", "1.7976931348623157E308"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "-1", "43"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "1", "-4106"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteFormattedNumbers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<null>", "-2147483646", "16385"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "-2147483584", "33554484"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "2020-01-01", "1E+100"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2146963392"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-2199023255552"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#760234653", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}}), new String[][]{{"writeArray", "long[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"3.4028235E38"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1540587937", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-4106"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "61480", "33554432"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-4106, getFormatFeatures=0, getHighestEscapedChar=127, g...#252#276571363", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-4106, getFormatFeatures=0, getHighestEscapedChar=127, g...#252#276571363", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"10a5", "-3.4028235E38"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "WRITE_NUMBERS_AS_STRINGS", "-2147483630", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"-32766"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"nulm"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "1.5-", "2147483647", "-1074790399"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<d:7.1000000000000005>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFeFFFFF", "<i:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCharacterEscapes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaKaaaaaaaaa9aaaaaaa"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<sample:0>", "172", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1634237408", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"131104"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=131104, ge...#251#1638167434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=131104, ge...#251#1638167434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"short"}, new String[]{"-88"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "\n"}, {"com.fasterxml.jackson.core.JsonGenerator", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportError", new String[]{"java.lang.String"}, new String[]{"WRITE_NUMBERS_AS_STRINGS"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{"int"}, new String[]{"-55"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "-32767"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"28020-00-00"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1766474760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"1 1234567", "-2147483648", "-2147483584"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1915136768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"8236"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canOmitFields", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<null>", "4", "-1023"}, {"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:Kb>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1915322882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEmbeddedObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "nulB"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:K/>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"D"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-4087"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-4087, getFormatFeatures=0, getHighestEscapedChar=0, get...#250#1224771569", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-4087, getFormatFeatures=0, getHighestEscapedChar=0, get...#250#1224771569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"0e12:30:45{\"a\":1}"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1100195781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "-26", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1915136768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"FLUSH_PARSED", "<s:a>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-706746202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#245#978292768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,int", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.6f", "<i:-33554430>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{" ", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:4>", "0", "2139226048"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{")", "0.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "Generator of type -1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1909907488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"Generator of typea-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "I4GNORE_UNNKNOWN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1233910053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setHighestNonEscapedChar", "int", "67108864"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=67108864, ...#253#349114292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00ea", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "QUOTE_FIELD_NAMESa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"4611686018427387904"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,int", "/a/0", "33554484"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#407091429", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#407091429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "8QUOTE_FIELD_NAMES"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{"int"}, new String[]{"-4067"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getHighestEscapedChar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:Klb>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCharacterEscapes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"K", "1E+100"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "-1074790349", "-45", "-1033"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String", ">1.12355678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-543515584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2e2"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "1.5fi", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"I5NOREbUNKNOWN", "-2046"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "35651584", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"/a/bWRITE_NUMBERS_AS_STRINGS", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<empty>", "32811"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"\n'", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<empty>", "2139094976", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-1057"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "-32768"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"/6/b1.5f", "-2147483648", "0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-463786334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,int", "QUOT", "-1074790374"}}, 2), new String[][]{{"copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "-16384"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<empty>", "-28"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1911425026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-696075448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "-2053"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1-1234567", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<empty>", "67108864", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String"}, new String[]{"[1,2]0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#73592544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"abce", "0"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String", "1.d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"abd"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String", "1."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:keey>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1386469917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"IGNORE_UNKNOW", "0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.7234567", "33554432", "2139094848"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1460858687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775792"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-390915102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteBinaryNatively", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-2147481536"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "-1074790399"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-2147483743"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#587271041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,double", "1.12345672020-01-01", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"288"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:2>", "1073741823", "-8212"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"truI", "Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "char[],int,int", "<empty>", "2147483647", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-1.15"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"1073741835"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-2147483648", "55"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0.5-", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "char[],int,int", "<empty>", "2147483647", "33554356"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1074790399", "2139094976"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,long", "a", "-9223372036854775806"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "4", "63"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,int", "-11LNo current event to copy", "-4106"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"12:30:4502:30:45", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "16369"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\t\t", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:Kb>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"nulm1.1234567\u00e9", "<s:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCodec", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"float"}, new String[]{"Infinity"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "float", "-0.976"}}, 1), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=33, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#876043662", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=33, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#876043662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:1>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "67108864"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<sample:4>", "2", "-1073217553"}}), new String[][]{{"flush", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=67108864, getFormatFeatures=0, getHighestEscapedChar=0, ...#253#1283577302", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=67108864, getFormatFeatures=0, getHighestEscapedChar=0, ...#253#1283577302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
}
