package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"262"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("262", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"1e101.1234567890123456", "1.7976931348623157E308"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"-1", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"5.+1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "999", "999999949", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"", "131584"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("131584", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"a9223372/36854775807", "135714"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("135714", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"-00./"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"1.25", "-9223372036854775808"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-9222372036854775808"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9222372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"aaaaaa`aaaaaaaaaaaaaaaaaaaabaa", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"-]", "499999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("499999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"10100"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "-999999999", "-2147483648", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"-0.0aaaaaaaaaaaaaaaaaaaaaaa`aaaaaa", "-999999999", "499999974"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "10001.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.00015E304", String.valueOf(actual));
  assertEquals("receiver state after the call", "10001.5e300 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, 0, 0, 0, 1, ., 5, e, 3, 0, 0], getTextOffset=0, hasTextAsChara...#220#-1887821057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345677", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "-67108863", "999999948"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"2147483648", "0.7000000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"-922237206954775808"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"+", "865782271"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("865782271", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "a,b,cHello, World", "2", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[b, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"10001.5e3001", "-1000000057"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.", "2147483647", "0"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"-]-0.", "1000000057"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000000057", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"5bc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-67108863", "3996"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"10C00"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-111e10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"02"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.25 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, ., 2, 5], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"1000000001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "5."}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5. {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[5, .], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-001./"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"150", "-2", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-32768", "262145"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#262265#-1999110006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"+", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"", "13107.2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("13107.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "4210688", "-31"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "8"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "8 {getCurrentSegment=[8, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[8], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"+10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "5", "-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483647, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 1, -, 0, 1], getTextOffset=0, hasTextAsCharacter...#216#-412128488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "2147450879", "5112"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "-999999999", "499999974"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "524292", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"000"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-02-31T25:61:61", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:3>", "262146", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"+2", "2000000000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hx123456789", "131072", "5"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "250", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"01\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"a923e72/36854775807", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"<"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:6>", "999", "1998"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"char[]", "int", "int"}, new String[]{"<sample:8>", "0", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"2.2250738585072012e-308", "81921"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "1073741823", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:9>", "1999999998", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:8>", "500016341", "33554431"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:1>", "262138", "2147483615"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"5151"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1e104.9E-324", "1", "-524292"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "2147483647", "4210664"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "999999999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#318#367437881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"<null>", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\uffff"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "-2147483648", "1000000000"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2228225"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "-1000000057"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.25-9223372036854775808"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"ur", "2147483647", "1999999998"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "1", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "262144", "2147483647", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:3>", "-1073741824", "262161"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{".25i", "1051132", "3095"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"trud"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:6>", "1000", "-536870902", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"10000000001234567890123456789F01234567890"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0x1234556789"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "5112", "262188"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"5.+F262144", "1000000000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{".4", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "ur", "131071", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-]]a"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"null0xFFFFFFFF"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2000000002", "999999948"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"4."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "1000000003", "10224"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-4", "1964"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"150", "1000000000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]"}, new String[]{"<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "557054", "33292289"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "3"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "4", "-999999999"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "a ["}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"X"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "X {getCurrentSegment=[X, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[X], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"362144", "-274743688217"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("362144", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World\t", "2556"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2556", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-524286", "2097"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getCurrentSegment=[1, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[1], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"/ITLE"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "557007", "-999"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1", "131064"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"_"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "_ {getCurrentSegment=[_, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[_], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "999999949", "4"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.", "1", "-2047"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-<00./"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-999999996", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"X"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "X {getCurrentSegment=[X, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[X], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1e101.123456790123456", "1000000000", "1"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"000000000null"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "000000000null {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, 0, 0, 0, 0, 0, 0, 0, 0, n, u, l, l], getTextOffset=0, hasTex...#228#250667709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2\u00e9020-02-30T25:61:61"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "2\u00e9020-02-30T25:61:61 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, \u00e9, 0, 2, 0, -, 0, 2, -, 3, 0, T, 2, 5, :, 6, 1, :, 6,...#256#765906795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{".", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "5112", "262139"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"1.5e30/"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2", "4"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "2577"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:3>", "2147483647", "557054"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "10", "-98"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "B"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B ", String.valueOf(actual));
  assertEquals("receiver state after the call", "B  {getCurrentSegment=[B,  , \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=2, getTextBuffer=[B,  ], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "2147483647", "1000000000"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF1234567890123345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6...#268#-1986270150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2612145"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2612145.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "2147483647", "2556", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"--1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"\t"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.12345678TITLE", "1.000000000063E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.000000000063E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"C"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "6C {getCurrentSegment=[6, C, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=2, getTextBuffer=[6, C], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "266240"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{".5010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.501", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"ur/a/b", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"2.2250738585072012e-308"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"abc<a>b</a>", "999999948"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("999999948", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:6>", "262144", "262196"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#262316#-1999105170", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"="}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "= {getCurrentSegment=[=, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[=], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"x_", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2501"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "-2147483648", "262155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"[1,2]", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "1073741823"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:6>", "1998", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"L"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "L {getCurrentSegment=[L, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[L], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "1000000001", "262196"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"lu", "1999999998"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999999998", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"8a", "35185372088833"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("35185372088833", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-00./4.9E-3[4"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-00./4.9E-3[4 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[-, 0, 0, ., /, 4, ., 9, E, -, 3, [, 4], getTextOffset=0, hasTex...#228#1248467197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "499999974", "266239"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"a,b,c", "262121"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("262121", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"5.\u00ea", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"F"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "PT1HH"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.123456678", "-1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.123456678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"26244"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("26244", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-262148", "-999999545"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890262145"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2345678901234568E35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"5.+1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"-9223372x0368", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"999999999"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "499", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"250"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("250.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"-9223372036854775808", "-4612811918334230527"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"Hellp, World", "9007200254740992"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9007200254740992", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483647", "1990"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"\u00e97h"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\u00e97h {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[\u00e9, 7, h], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "P"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[P, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "-0.0aaaaaa\"aaaaaaaaaaaaaaaaa`aaaaaa", "1999999896", "-999999949"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "b"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "x"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "bx {getCurrentSegment=?, getCurrentSegmentSize=2, getTextBuffer=[b, x], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "131072", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"1.5ud", "999999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("999999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "524308", "5112"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"10001.5e300", "524402"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.1234567 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, ., 1, 2, 3, 4, 5, 6, 7], getTextOffset=0, hasTextAsCharacters=tr...#211#1753477634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"B."}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"char[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"-912237206954775808"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-912237206954775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "!"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[!, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#1883152631", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "! {getCurrentSegment=[!, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[!], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"\u00e8", "4194304"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "262145", "262146"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"1.124567", "-999999949"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"1e101.1234567901234561.1234567890123456", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"-\u00e9", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"0x123456795.", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "1999999998", "2359297"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-51187401", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "{\"\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":1} {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[{, \", \", :, 1, }], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "aaauaaa`aaaaaaaaaaaaaaaaaaaabaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "aaauaaa`aaaaaaaaaaaaaaaaaaaabaa {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[a, a, a, u, a, a, a, `, a, a, a, a, a, a, a, ...#269#2033171188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"66846721"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "999999964"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"Hellp, Wrld", "-140737488355328"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-140737488355328", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{",", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "+", "-2147483648", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"i"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "i {getCurrentSegment=[i, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[i], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"I"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "I {getCurrentSegment=[I, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[I], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"java.lang.String", "boolean"}, new String[]{"abcl", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "15L-9223372036854775808"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "15L-9223372036854775808 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, 5, L, -, 9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7,...#261#1637325135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\uffff]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "2147483647", "-1000000057"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:7>", "-1000000057", "1001"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"10xFFFFFFF", "262145"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("262145", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"2", "-9223372036854775808"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "262143", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-1, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"/"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentSegment=[/, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[/], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-1000000090", "557070"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"U"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "U {getCurrentSegment=[U, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[U], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"1.12345677"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1.12345677", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-9222372069547758008"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.2223720695477576E18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"h"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:6>", "-999999938", "5112"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "h {getCurrentSegment=[h, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[h], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"-922237206964775908", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "D"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[D, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"httt", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsDouble", new String[]{"java.lang.String", "double"}, new String[]{"aa 4b", "1000000000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "65534", "1001"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:2>", "2147483647", "-67108859"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "!"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[!, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsLong", new String[]{"java.lang.String", "long"}, new String[]{"-h1000", "249999999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("249999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "inLongRange", new String[]{"char[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "262144", "1001", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "OT1H", "262139", "524278"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseAsInt", new String[]{"java.lang.String", "int"}, new String[]{"21447483658", "1000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"-922237206964775901000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.1234567890123456", "131098", "262144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "1999999998", "131095"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "-2147483592", "2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"10100"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "2020-02-30T25:61:61", "-131071", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483639"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Value \""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[V, a, l, u, e,  , \"], getTextOffset=0, hasTextAsCharacters=true, size...#203#-1571938428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.NumberInput", "com.fasterxml.jackson.core.io.NumberInput", "parseBigDecimal", new String[]{"java.lang.String"}, new String[]{"-92223720696477598123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-92223720696477598123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
}
