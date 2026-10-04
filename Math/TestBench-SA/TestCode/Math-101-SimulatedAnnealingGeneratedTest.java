package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://oex"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<empty>", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:0>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-00.\t230-/2-30S25961:61", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1-5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"6-1i"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:20>", "<sample:0>", "<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "77-1ini-0.0"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "true", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.1234568"}}, 1), new String[][]{{"append", "java.lang.String", "2"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(NaN) + (NaN)1.12345680a {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.1234568}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<sample:2>", "<sample:12>"}, false, 16, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "Title"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "50/.02020-l2r-p"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "12W96339 +\0360o1f4jhstp:", "<sample:9>"}}, 3), new String[][]{{"append", "float", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample(Infinity) - (Infinity)Title-1.0 {length=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=Title}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1.255."}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1E-5.5", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.255.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{",633734677957722306"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\n"}}, 3), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.4404724904183735, getReal=0.897766108284689, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-6337346779577272306"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", " + ", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", " + ", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://ex"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://ex"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1e10"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1e10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1\u00e910"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "1233456789012345678901234567890"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1\u00e910}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1\u00e911"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "1233456789012345678901234567890"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1\u00e911}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "12345578:012345678901234567890"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "+1", "<sample:4>"}}, 2), new String[][]{{"parse", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1Ett-5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Ett-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1Ectt-5"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Ectt-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"2Ectt-5"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=2Ectt-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"2Edts-5"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=2Edts-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<null>", "<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:0>", "<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:1>", "<null>"}}, 2), new String[][]{{"offsetByCodePoints", "int,int", "5"}, {"offsetByCodePoints", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2), new String[][]{{"offsetByCodePoints", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, false, 17, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2), new String[][]{{"offsetByCodePoints", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2), new String[][]{{"offsetByCodePoints", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:1>", "<sample:6>"}, false, 18, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:1>", "<sample:6>"}, false, 18, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", ".5", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "\u00e9", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "TITLE"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1E-5", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=TITLE}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:2>", "<sample:2>"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1,5 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample2 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 14, new String[][]{}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2e {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 14, new String[][]{}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "7"}, {"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>"}, false, 13, new String[][]{}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "7"}, {"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:?>", "<sample:2>", "<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:4>"}}, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<aub</a", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"c", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:4>"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\"", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a b", "<sample:2>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "i"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\"", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a b", "<sample:2>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "i"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample(Infinity) - (Infinity)i {length=30}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<empty>", "<sample:5>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:2>", "<sample:5>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 + (Infinity)i {length=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:5>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 + 1i {length=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:5>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setImaginaryCharacter", "java.lang.String", "5"}, {"setImaginaryCharacter", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "{\"a\"", "<sample:8>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "0x123456789aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "{\"a\"", "<sample:8>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "0x123456789aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.12345678", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1123456782147483648", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.12345678214748365E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"/5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=/5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0"}}, 1), new String[][]{{"isParseIntegerOnly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0"}}, 1), new String[][]{{"isParseIntegerOnly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{" - "}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-6337346779577272306"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "true"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "true"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<empty>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<empty>", "<sample:6>"}, false), new String[][]{{"insert", "int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:6>"}, false), new String[][]{{"insert", "int,float", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(In0.0finity) - (Infinity)i {length=27}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1Et-5", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=123456789012345678901234567890}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}), new String[][]{{"parse", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=I}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"Ie"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=Ie}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "htp://ex", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "htp://ex", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:4>"}}), new String[][]{{"isGroupingUsed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:11>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:10>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1Et-5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Et-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1Ett-5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Ett-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"setImaginaryFormat", "java.text.NumberFormat", "6"}, {"format", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample(Infinity) - (Infinity)i {length=30}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:2>", "<sample:2>"}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 + 1i {length=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", ".5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:>", "<sample:1>", "<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.12345678901234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\"", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a b", "<sample:2>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0x123456789"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0x123456789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.5f"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.5f}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:30:45", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:3145", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"tru6eT", "<sample:6>"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"parseObject", "java.lang.String", "2"}, {"add", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0x1F}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "A"}}, 1), new String[][]{{"isParseIntegerOnly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=A}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ""}}), new String[][]{{"isParseIntegerOnly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ""}}), new String[][]{{"isParseIntegerOnly", "", "2"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:0>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"SI", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:0>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"SI", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:0>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-0.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}}, 2), new String[][]{{"exp", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-00.02020-02-30T25:61:61", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-00.02020-02-30T25:61:61", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "\t", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getImaginaryFormat", "", "0"}, {"getNegativePrefix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getImaginaryFormat", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"getImaginaryFormat", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setCurrency", "java.util.Currency", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=010}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:16>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(NaN) + (NaN)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:0>", "<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<empty>", "<sample:0>"}}), new String[][]{{"insert", "int,long", "3"}, {"append", "java.lang.CharSequence", "4"}, {"insert", "int,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("29-1.0223372036854775807 {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:0>", "<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<empty>", "<sample:0>"}}), new String[][]{{"appendCodePoint", "int", "3"}, {"append", "java.lang.CharSequence", "4"}, {"insert", "int,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2\001-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "http://example.com/a?b=c", "<sample:5>"}}), new String[][]{{"length", "", "1"}, {"indexOf", "java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "http://example.com/a?b=c1e10", "<sample:5>"}}, 3), new String[][]{{"length", "", "4"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)0a {length=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=15.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/b", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "Ti", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/aaa/b", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:2>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1.5", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:6>"}}), new String[][]{{"negate", "", "5"}, {"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-2.2924316695611777, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1.5 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:a>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"applyLocalizedPattern", "java.lang.String", "2"}, {"setDecimalSeparatorAlwaysShown", "boolean", "5"}, {"getGroupingSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:2>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:2>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:2>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:8>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:16>", "<null>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<empty>", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<empty>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 11, new String[][]{}, 2), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", ",-1", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", ",-1", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter= }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<empty>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:2>", "<sample:3>"}}), new String[][]{{"substring", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "http://example.com/a?b=c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\u00ea", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=http://example.com/a?b=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"t", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "nttp://example.com/a?b=c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=nttp://example.com/a?b=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"t", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "nttp://examqle.com/a?b=c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=nttp://examqle.com/a?b=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample2 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:1>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 1), new String[][]{{"deleteCharAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "2"}, {"acos", "", "4"}, {"tan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=--1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "--0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=--0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:16>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(NaN) + (NaN)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2"}, false, 9, new String[][]{}), new String[][]{{"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1Et-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1Et-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Et-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1Eu-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1Eu-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1Eu-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-1.5"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-1.6"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-1.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-1.5"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-1..5"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1..5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-1..5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "6-1i"}}), new String[][]{{"substring", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"getImaginaryCharacter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"getImaginaryCharacter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:16>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(NaN) + (NaN)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getImaginaryCharacter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, null, 3), new String[][]{{"append", "float", "5"}, {"append", "java.lang.Object", "3"}, {"substring", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=1, getIndex=0, getRunLimit=1, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"applyPattern", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=0, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=0, getMultiplier=1, getNegativePrefix=-a, getNegativeSuffix=, ge...#374#176953431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:6>"}}, 2), new String[][]{{"applyPattern", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=0, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=0, getMultiplier=1, getNegativePrefix=-a, getNegativeSuffix=, ge...#374#176953431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getRealFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<empty>", "<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3), new String[][]{{"append", "char[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "6-1i"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=6-1i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isParseIntegerOnly", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"setCurrency", "java.util.Currency", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", " + ", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "01xx1F"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=01xx1F}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1L", "<sample:7>"}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0xFFFFFFFF}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.5d}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1X5d"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1X5d}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1X5d1e10"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1X5d1e10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1X5d1e10+1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1X5d1e10+1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.12345C8900234567", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.12345C8900234567", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<empty>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false), new String[][]{{"getMinimumIntegerDigits", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getMinimumIntegerDigits", "", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false), new String[][]{{"sqrt1z", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=2.147483648E9, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"12t-5 +  "}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "[1,2]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:0>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "5"}, {"getImaginaryFormat", "", "3"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "5"}, {"getImaginaryFormat", "", "3"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"setRoundingMode", "java.math.RoundingMode", "2"}, {"getDecimalFormatSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=$, getDecimalSeparator=., getDigit=#, getExponentSeparator=E, getGroupingSeparator=,, getInfinity=\u221e, getInternationalCurrencySymbol=USD, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-1806874468", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1/123A567890123456"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1/123A567890123456}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1Et-5", "<sample:7>"}, false), new String[][]{{"getReal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:16>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(NaN) + (NaN)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "!", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:0>"}}, 3), new String[][]{{"format", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " + "}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " -00.\t230-/2-30S25961:610x123456789", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter= + }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " + "}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " -00.\t230-/2-30S25961:610x1234567891.1234567890323456", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter= + }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " + "}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " -00.\t230-/2-30S25961:610x1234567891.1234567890323456", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter= + }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\037+ "}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " -00.\t230-/2-30S25961:610x1234567891.1234567890323456", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\037+ }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0", "<sample:2>"}, false, 9, new String[][]{}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "3"}, {"conjugate", "", "1"}, {"divide", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"getGroupingSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example.com/a?b=c"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2), new String[][]{{"getRoundingMode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.RoundingMode", actual.getClass().getName());
  assertEquals("HALF_EVEN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "htp://example."}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5e300", "<sample:1>"}}, 3), new String[][]{{"getRoundingMode", "", "3"}, {"setCurrency", "java.util.Currency", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "hptp:x-/example6a"}}, 2), new String[][]{{"getRoundingMode", "", "3"}, {"setCurrency", "java.util.Currency", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "hptp:x-/exam"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "a b", "<sample:3>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 2), new String[][]{{"getRoundingMode", "", "3"}, {"getMaximumFractionDigits", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=2.147483648E9, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b</a>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "<a>b<\n/a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=2.147483648E9, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b<\n/a>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "<a>b<\n/>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.25, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b<\n/>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"eIULE6.", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 1), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-6.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getGroupingSize", "", "5"}, {"getMaximumIntegerDigits", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getGroupingSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "abc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=abc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"6-1i"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"asin", "", "4"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4034133718392579", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"6-1i"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 2), new String[][]{{"asin", "", "4"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4034133718392579", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"6-1i"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3), new String[][]{{"asin", "", "4"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4034133718392579", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"\n4"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"asin", "", "4"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1.51.5f"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:3>"}}, 2), new String[][]{{"asin", "", "4"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1.51.5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<empty>", "<null>"}}, 2), new String[][]{{"asin", "", "4"}, {"tan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.000000217843638, getReal=-2.667815427733407E-23, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
}
