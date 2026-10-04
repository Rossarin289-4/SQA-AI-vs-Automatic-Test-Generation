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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:kDey>", "<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678901233567", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "2l20-/2-30T25:61:61", "<sample:4>"}}), new String[][]{{"getRoundingMode", "", "3"}, {"getNegativeSuffix", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-15", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2K", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-00-01", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:7>", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-15 + 2020-01-01", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "12:3e:{5", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-6,37346779577272306"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<sample:1>", "<sample:8>"}}, 3), new String[][]{{"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.9996087793737568, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"10 "}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<empty>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=10.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678901234567-1.5", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1L,"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1L,}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890\u00e9"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "2020-0i2-30T25:61:611L"}}), new String[][]{{"sqrt", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=3.5136418288201444E14, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:1>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:8>", "<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+2", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"221f"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=221f}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "21474"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=21474}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-6337346779577212306/a/b", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5f", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123446789012346678901234567890", "<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=6.789012346678901E24, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "abc", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<null>"}}, 1), new String[][]{{"cos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:>", "<empty>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setGroupingUsed", "boolean", "6"}, {"getPositiveSuffix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "x1F", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0E-5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<empty>", "<sample:6>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<null>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:kexP>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1D-"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=/a/b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:-1.5>", "<empty>", "<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1,5 {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.6f", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:9>", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.5e300}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "+1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=+1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"t.5/a/b"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "010  "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:30:45", "<sample:7>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFa"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0xFFFFFFFFa}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "123456789012345678901234567890", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"<a>b</at>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b</at>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "a,b,c0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=a,b,c0x123456789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"-1.5PT1H"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " , "}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-1.5PT1H}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\013", "<sample:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:7>", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "ab"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=12345.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=ab}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1null"}}, 2), new String[][]{{"setParseBigDecimal", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c-15"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "http://example.com/a?b=c", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:10>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\014"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0E-5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0x1F}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getDecimalFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=\u20ba, getDecimalSeparator=,, getDigit=#, getExponentSeparator=E, getGroupingSeparator=., getInfinity=\u221e, getInternationalCurrencySymbol=TRY, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-202726929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=1, getIndex=0, getRunLimit=1, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:11>", "<sample:5>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:3>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>"}, false, 0, null, 3), new String[][]{{"appendCodePoint", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:1>", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1,5 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}, 2), new String[][]{{"setRoundingMode", "java.math.RoundingMode", "5"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#269191821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:5>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 10 {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:0>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" , ", "<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ":"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=:}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:2>", "<sample:5>"}, false, 6, new String[][]{}, 2), new String[][]{{"delete", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampe(-Infinity) - 1i {length=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<null>", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "0xFFF", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "t\rrue", "<sample:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\t}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "11f", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:keyP>", "<empty>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"21T474836448"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=21T474836448}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"5.1"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=5.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:5>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "i", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}}), new String[][]{{"lastIndexOf", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:3>", "<sample:10>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:7>"}}), new String[][]{{"insert", "int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:-0.75>", "<sample:5>", "<sample:8>"}, false, 6, new String[][]{}), new String[][]{{"append", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-0.751.0 {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"2020-01-001"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=2020-01-001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x113456789", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getPositiveSuffix", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"@", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:11>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b</a>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " - ", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}), new String[][]{{"getDecimalFormatSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=\u00a4, getDecimalSeparator=., getDigit=#, getExponentSeparator=E, getGroupingSeparator=,, getInfinity=\u221e, getInternationalCurrencySymbol=XXX, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-665557526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:15.0>", "<empty>", "<sample:0>"}, false), new String[][]{{"append", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("15a {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:3>"}}), new String[][]{{"getCurrency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{" + "}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-40>", "<sample:2>", "<sample:0>"}, false), new String[][]{{"append", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-40\000 {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>"}, false), new String[][]{{"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "2020-00-01"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:3>", "<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "", "<sample:1>"}}), new String[][]{{"append", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i1 {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:2>", "<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"append", "double", "3"}, {"append", "char[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 + (Infinity)i1.0\000  {length=26}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:4>"}}), new String[][]{{"reverse", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("i1 + 0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-0B.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<sample:3>", "<sample:8>"}}), new String[][]{{"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:-b>", "<sample:0>", "<sample:7>"}}), new String[][]{{"toPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "++1"}}), new String[][]{{"setMinimumFractionDigits", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=++1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "1. 234567"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:8>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.5 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)0 {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "-0.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:5>", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:7>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<empty>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("7 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "tr", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=123456789012345678901234567890}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:1>", "<sample:2>"}}), new String[][]{{"format", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getCurrency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("USD {getCurrencyCode=USD, getDefaultFractionDigits=2, getDisplayName=US Dollar, getNumericCode=840, getNumericCodeAsString=840, getSymbol=$}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-1>", "<sample:4>", "<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1.02020-00-01", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<null>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.123456789012334567"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]<a>b</a>", "<sample:5>"}}), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"020"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "<a>b/a>"}}), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.40808206181339196, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=<a>b/a>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"00", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/b", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:8>", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "[1,f2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=[1,f2]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "123456789012345678902234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5.e", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i {length=16}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 + 1i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-1>", "<sample:1>", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-6337346779577272306"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-6337346779577272306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "http://example.comm/a?b=cHello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=http://example.comm/a?b=cHello, World}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11f11f", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:kEey>", "<sample:11>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=11.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"abc", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:8>", "<sample:8>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("9,223,372,036,854,775,807 {length=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=a b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", " + a", "<sample:0>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-0.0 - "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-0.0 - }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x1F", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "5.null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-6337346779577272306\t", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "020"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-6.3373467795772723E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=020}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.12345678901233567"}, false), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-69.98142099269697, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-11.5", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:5>"}}), new String[][]{{"cosh", "", "7"}, {"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Helmo, World", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "a b"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=a b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678901234567", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "", "<sample:4>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.123456", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "tsue11f", "<sample:4>"}}), new String[][]{{"getGroupingSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "i195f"}}), new String[][]{{"append", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i195f}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false), new String[][]{{"format", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"90"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}), new String[][]{{"atan", "", "7"}, {"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=2.524160614227419E-16, getReal=2.483763893376748, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-633346779577272306"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-6.3334677957727232E17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-63373467"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<null>", "<sample:5>"}}), new String[][]{{"getReal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3373467E7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.1234567870123456712:30:45"}}), new String[][]{{"atan", "", "1"}, {"subtract", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-0.10394461542865596, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.1234567870123456712:30:45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"5."}, false, 3, new String[][]{}), new String[][]{{"sqrt1z", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=4.898979485566356, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}), new String[][]{{"getCurrency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2\u00e920-/2-30T25:61:61", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<b:true>", "<sample:6>", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1E-512:30a45"}}), new String[][]{{"sin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1E-512:30a45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:2>", "<sample:7>"}, false, 0, null, 3), new String[][]{{"replace", "int,int,java.lang.String", "7"}, {"append", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampae0 + 1i0 {length=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"getImaginaryCharacter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "2020-00-011.5d"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:kDey>", "<sample:5>", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "H5."}}), new String[][]{{"setGroupingUsed", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#373#1279167160", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=H5.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:1>", "<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(-Infinity) - 1i {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 1), new String[][]{{"charAt", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 + (Infinity)i {length=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"parse", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"toPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0.##", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:8>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ""}}, 3), new String[][]{{"codePointAt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<empty>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "5.e-6337346779577272306"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)5.e-6337346779577272306 {length=46}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=5.e-6337346779577272306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<null>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "`0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)`0x123456789 {length=26}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=`0x123456789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:bb>", "<sample:7>", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"Hdllo, World"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=Hdllo, World}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<null>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexFormat", actual.getClass().getName());
  assertEquals("{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:0>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"indexOf", "java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "0x1F", "<sample:1>"}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<sample:11>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3), new String[][]{{"append", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaCaaaaaaaaaaaaabaaaa", "<sample:6>"}}, 3), new String[][]{{"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:0>"}}, 2), new String[][]{{"append", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2true {length=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"6.e", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<sample:6>", "<sample:8>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5d", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "-6337346779577212306/a/bhttp://example.com/a?b=c"}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\u00e9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:2>"}}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aa", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1E-5"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:9>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1E-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"-6337346779577212306/a/b"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-6337346779577212306/a/b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "I"}}), new String[][]{{"append", "float", "7"}, {"insert", "int,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.5true0.0 {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=I}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "Uite"}}), new String[][]{{"getMaximumFractionDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=Uite}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "PT1H1.1234567890123456"}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:4>", "<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.12345678901234561.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.12345678901234561.1234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.12445578"}}), new String[][]{{"setNegativeSuffix", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=a, ge...#373#1009096374", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.12445578}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("(Infinity) - (Infinity)0 {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "5."}, {"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=5.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ";K"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=;K}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1,.1234567", "<sample:7>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFFF", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "\t-0.0", "<sample:7>"}}, 3), new String[][]{{"setPositivePrefix", "java.lang.String", "5"}, {"isGroupingUsed", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 1), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-9,223,372,036,854,775,808 {length=26}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678901233567", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:5>"}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hello, Wosrld", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "abb"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:kXey>", "<sample:2>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=abb}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "i1.1234567890123456"}}, 2), new String[][]{{"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i1.1234567890123456a {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i1.1234567890123456}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "http://example/coom/a?b=c", "<sample:5>"}, {"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5em00", "<sample:0>"}}, 1), new String[][]{{"format", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-\u221e", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:3>", "<sample:8>"}, false, 5, new String[][]{}, 2), new String[][]{{"indexOf", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<empty>", "<sample:3>"}}, 3), new String[][]{{"setPositivePrefix", "java.lang.String", "5"}, {"toPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a#,##0.##;-#,##0.##", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 + (Infinity)i {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "--1http:0/example.com/a?b=c"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=--1http:0/example.com/a?b=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<sample:4>"}, false, 0, null, 1), new String[][]{{"acos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "12:30:4511f1L"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-6337346779587272306I", "<sample:5>"}}), new String[][]{{"cosh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=12:30:4511f1L}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "Hello, World"}}), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}, {"getDecimalFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=$, getDecimalSeparator=., getDigit=#, getExponentSeparator=E, getGroupingSeparator=,, getInfinity=\u221e, getInternationalCurrencySymbol=USD, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-1806874468", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=Hello, World}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-63373467795772723062020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-63373467795772723062020-01-01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-0.0", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:9>"}, {"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11f", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}), new String[][]{{"cos", "", "6"}, {"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.7165256995489035, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-\u221e {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.123456789012335671.1234567"}, false, 0, null, 2), new String[][]{{"log", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=57.681037675706534, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", " + "}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter= + }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1\t"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1\t}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"org.apache.commons.math.complex.Complex", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "a bab"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 + 1i {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"01"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object", "5"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "5.\r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=5.\r}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<null>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-15 + 2020-501-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-15 + 2020-501-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-15 + 2020-501-01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:1>", "<null>"}}, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "0"}, {"insert", "int,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-13 {length=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getImaginaryFormat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "OTT1H"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0P0", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\""}}), new String[][]{{"asin", "", "7"}, {"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, false, 7, new String[][]{}, 3), new String[][]{{"append", "java.lang.CharSequence", "5"}, {"length", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.12345678901233567"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "-12l20-/2-30T25:61:61"}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}), new String[][]{{"abs", "", "4"}, {"pow", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.8901098909902265, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-12l20-/2-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}, {"current", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\"-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\r-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\r-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"-15 + 2020-01-01"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=-15 + 2020-01-01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "\""}, {"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "formatComplex", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 + (Infinity)i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-2147483648>", "<sample:5>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1}:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-2,147,483,648 {length=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1}:30:45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:-2.1>", "<sample:7>", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setRealFormat", "java.text.NumberFormat", "<sample:5>"}}, 2), new String[][]{{"insert", "int,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-2-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Hello, World", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}, {"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "nul"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=nul}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2/20-01-01", "<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "5"}, {"multiply", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"t\rue-15", "<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=15.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1La,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1La,b,c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "11ftrue"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-1222032123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=11ftrue}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "0n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "!+ a b"}}, 3), new String[][]{{"setPositiveSuffix", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#895804623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setRealFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String,java.text.ParsePosition", "2l20-/2-30T2n5:61:61", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryCharacter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", "1.5I"}, {"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=1.5I}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getRealFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", ""}}, 3), new String[][]{{"setNegativeSuffix", "java.lang.String", "4"}, {"getMaximumIntegerDigits", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "getImaginaryFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", "java.lang.String", ""}}, 1), new String[][]{{"getCurrency", "", "0"}, {"getDisplayName", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unknown Currency", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parse", "java.lang.String", "-6337346779577212306/a/b"}}, 1), new String[][]{{"exp", "", "0"}, {"tanh", "", "2"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1234567-63373467795757212306/a/b", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1E-5", "<sample:6>"}, {"org.apache.commons.math.complex.ComplexFormat", "format", "org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition", "<sample:9>", "<sample:7>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "setImaginaryCharacter", new String[]{"java.lang.String"}, new String[]{"d\u00e9"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getImaginaryCharacter=d\u00e9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-262143>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "setImaginaryFormat", "java.text.NumberFormat", "<sample:9>"}}, 3), new String[][]{{"append", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-262\u00a0143a {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginaryCharacter=i}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.ComplexFormat", "org.apache.commons.math.complex.ComplexFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"`bc", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.ComplexFormat", "getRealFormat", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
