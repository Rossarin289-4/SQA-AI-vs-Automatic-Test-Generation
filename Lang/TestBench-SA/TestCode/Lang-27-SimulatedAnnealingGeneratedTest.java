package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double", "double", "double"}, new String[]{"0.0", "-1.7976931348623157E308", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float", "float", "float"}, new String[]{"1.0", "NaN", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.223495{67", "-2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String"}, new String[]{"0x"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-2", "-2", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"1", "32767", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-23", "-32768", "32767"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String"}, new String[]{"-0x"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String"}, new String[]{"8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte", "byte", "byte"}, new String[]{"1", "-1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"-4", "-4", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-1.0", "-2.0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"1073741729", "-6", "-1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"short[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"short[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"e."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte", "byte", "byte"}, new String[]{"-2", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createBigDecimal", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"float", "float", "float"}, new String[]{"Infinity", "Infinity", "-3.4028235E38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"52", "2147483630", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toInt", new String[]{"java.lang.String", "int"}, new String[]{"112255688", "-2147483624"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("112255688", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"<null>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long", "long", "long"}, new String[]{"1", "-2", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long", "long", "long"}, new String[]{"-9223372036854775808", "-2", "-9223372036854775808"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long", "long", "long"}, new String[]{"-13", "-536870910", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0x"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"--1.5"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"E"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e300a b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5e3002147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"short[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"+xFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"float[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"float[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toInt", new String[]{"java.lang.String"}, new String[]{"+xFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long", "long", "long"}, new String[]{"9223372036854775807", "9223372036854775807", "-13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"float[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"short", "short", "short"}, new String[]{"0", "-23", "32767"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1.4e"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"0x,F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"1", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"E"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte", "byte", "byte"}, new String[]{"0", "37", "127"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"short", "short", "short"}, new String[]{"32767", "32767", "32705"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32705", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte", "byte", "byte"}, new String[]{"1", "-1", "-36"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{".d"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"<F"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1.13456781.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createBigInteger", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"[+2]-1--1 is not a valid n?mber."}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{".1DC3E56781.251.5e300"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"0x1cF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"+wGFFFFFF1 5e3000xFFEFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.,12345678901234561L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0Ef5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0Ef5\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createInteger", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toInt", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"Gelo, >nW{\"a!:[2}null"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createBigDecimal", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createFloat", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"<null>", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{".."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createLong", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{".D3E56781.251.5e300"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"3L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"0x123x456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"0x"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"1EEf"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0F"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"0E-1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"0.f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createNumber", new String[]{"java.lang.String"}, new String[]{"-L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"4e."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{"2.4el"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:20>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float", "float", "float"}, new String[]{"1.0", "NaN", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isDigits", new String[]{"java.lang.String"}, new String[]{"1.5dTI4maDh.up://exampje.com/a?b<cII"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-23", "32767", "32767"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"19", "-32711", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-32768", "-32768", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-16384", "-32768", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-16384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"16384", "-32768", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("16384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-2", "-32768", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-4", "-32714", "-32768"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"2", "-32768", "-2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "127"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String", "float"}, new String[]{".5", "-0.946"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"+5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{",aaaDaaaaaaaaabaaaaaaaaaabaaaaaa1e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-4", "-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"10", "-4", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"-1", "-2", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-0.99", "5.7", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"abc", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"bbc", "27"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-2147483585", "-2", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"0", "-4", "47"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"0", "-4", "26"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"268435453", "-8", "8388634"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "-2", "8388634"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "-1", "8388634"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "0", "16777268"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "-2147483648", "16777268"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "2147483647", "8388634"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870906", "2147483647", "4194317"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194317", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2020t_01-01", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2021t_01-01", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2021t_01-01", "67108864"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("67108864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2021t_0I-01", "-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2021u_0I-+1", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"20211u_0I-+1", "9223372036854775807"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"20211u_0I-+1", "281474976710654"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("281474976710654", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"1..5f", "144396663052566526"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144396663052566526", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"0e21\n", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"Hello,5 World1.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-4194306", "0", "16777177"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194306", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createInteger", new String[]{"java.lang.String"}, new String[]{"-X"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte", "byte", "byte"}, new String[]{"-128", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte", "byte", "byte"}, new String[]{"-126", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-126", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"long[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float", "float", "float"}, new String[]{"NaN", "-0.455", "0.56"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"long[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.1234567", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.2234567", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.22349567", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.22349567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.12345678901234567", "-2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"", "-4.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String", "double"}, new String[]{"", "-3.77"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isDigits", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"I", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isDigits", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"268435454", "-1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-2", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-1073741824", "-4", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-1073741824", "-4", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"32767", "32767", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-46", "16383", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("16383", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-23", "-32767", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"-32760", "-32768", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32760", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"0", "-32768", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short", "short", "short"}, new String[]{"19", "-32768", "-32768"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "127"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createLong", new String[]{"java.lang.String"}, new String[]{"i"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String"}, new String[]{"88"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("88", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String", "float"}, new String[]{"\u00e9", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String", "float"}, new String[]{"\u00e9\u00e90x125345678:", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String", "float"}, new String[]{"\u00e9\u00e90x125345678:", "-0.946"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.946", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toFloat", new String[]{"java.lang.String", "float"}, new String[]{".5", "-0.946"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createLong", new String[]{"java.lang.String"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createLong", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createLong", new String[]{"java.lang.String"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"2."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"+"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"I", "-128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"I", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"I", "-64"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"-16777220", "-2", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"int", "int", "int"}, new String[]{"4", "-4", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"short[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createBigDecimal", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-1.0", "2.0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-0.99", "5.7", "-0.1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.99", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-9.9E-4", "5.7", "-1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-9.9E-4", "5.7", "-8.988465674311579E307"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-0.009899999999999999", "-5.7", "-2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"double", "double", "double"}, new String[]{"-0.0099", "-4.1000000000000005", "-2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.1000000000000005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createFloat", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createFloat", new String[]{"java.lang.String"}, new String[]{"61E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("6.1E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "createFloat", new String[]{"java.lang.String"}, new String[]{"+611-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float", "float", "float"}, new String[]{"-1", "Infinity", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"float", "float", "float"}, new String[]{"-1", "Infinity", "-7.3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-7.3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"-2147483585", "-2", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"0", "-4", "26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"536870916", "2147483647", "8388675"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388675", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"1073741729", "-6", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int", "int", "int"}, new String[]{"1073741729", "-68", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-68", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"double[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2020-01-01", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toLong", new String[]{"java.lang.String", "long"}, new String[]{"2020t_-01-01", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"[", "-75"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"[[", "-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"[ZZ", "-18"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"1e10", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toByte", new String[]{"java.lang.String", "byte"}, new String[]{"0e10", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"a b", "-23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"1.12345678901234567", "-35"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"1.12345678901234567", "35"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toShort", new String[]{"java.lang.String", "short"}, new String[]{"1.12345678901234567", "70"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "toDouble", new String[]{"java.lang.String"}, new String[]{"8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "isNumber", new String[]{"java.lang.String"}, new String[]{",,"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "max", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.NumberUtils", "org.apache.commons.lang3.math.NumberUtils", "min", new String[]{"int[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
