package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-37", "4294967294"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967257", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-9222809086901354496"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"1073741854", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305843073638203392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"-214743548", "2147483647", "-2147483648", "-524288"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"MIN > MAX10", "1073741823", "2147483646", "126"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:7>", "2147483647", "2147483646", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2147483647", "1048576"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"0", "1048576", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:6>", "-2147483587", "2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"9223372036854775807", "70368744177664"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-1", "1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483617"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483617", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"32212254721", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:5>", "57", "1048599", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2145386495", "524260"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2147483646", "524260"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-551903293439", "-18"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-551903293421", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"0", "-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"Hello, Worle", "2097198", "-2147483648", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-1073741823", "1073741887"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"4402341478398", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "-4611686018427387906"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"57", "40", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1048599", "2147483586"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"7", "-41"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-287", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"536870927", "2147483630"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1610612703", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"9223372036854775807", "-75"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "8192", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147475454", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"1", "2147483390"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483390", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"288230376151711744", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"10737418238", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-2147483647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-2147483649", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483649", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"2147483648", "4294967296"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6442450944", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-524288", "40", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146959320", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<b:false>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1", "536870933"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870934", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"126"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-126", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "89", "-2147483648", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"137438953473", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:4>", "7", "2147483647", "-4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-40", "-1048574", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:32>", "<i:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:2>", "-12", "2147483647", "1073750015"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"524260", "1048577"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"40", "524260"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20970400", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-14"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:3>", "-22", "-2147483617", "14"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9222809086901354496", "-4611686018427387906"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"16385", "126"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2064510", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-8193", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8194", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:3>", "0", "-524288", "1048599"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"34", "262130"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8912420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"0xFFFFFFFF", "2147483647", "-2147483646", "2147483647"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147450880", "-2305843009213693953"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843011361144833", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"-0.0", "1073741823", "-1107296207", "2147483647"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483617", "1073741823", "2147483647", "14"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2097247"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097247", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-9151314442816847823", "2097148"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-9205357638345293823", "-4611686018427387903"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2097198"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:10>", "1073741808", "2097247", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"536870927", "-9223372036854775804"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.375>", "<i:-1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1103806586878"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"4402341478398", "-2147483649"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4404488962047", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:4>", "-524284", "2097152", "10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "-23"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-10", "40"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"PT0H", "1610612735", "7", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"0", "-2147483697"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483697", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"28"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2097198", "2147483647", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-73", "126"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"1", "-1", "126"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483642", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-2305843009213693913", "-12"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305843009213693901", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1073741797"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741797", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"1.12345678901234567", "-2147483605", "-2147483648", "-1048599"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"14", "-2147483644", "2097198"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"63"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"1", "22"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"2147483648", "-4294967294"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483648", "-2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-277025386495", "2147483709"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-279172870204", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"140737488355328", "9223372036854775807"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223231299366420479", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2", "40"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-80", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:5>", "-524288", "-2147483648", "41"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"268435401", "2251799813685250"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2251799545249849", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"70368744185854", "-18"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("70368744185872", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"0", "2147483327"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483617", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483617", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-4611686018427387873", "547608330303"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611685470819057570", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"1073741823", "1", "1073741823", "-524288"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"38654705148", "-9222809086901354496"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9222809125556059644", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9222809086901354434", "576460752303423489"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8646348334597930945", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"279172874238"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483386"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483386", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2145386526"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386526", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-1048561"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048561", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"0", "-51"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:4>", "-1", "-2147483648", "1073741823"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1073741823", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741830", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372036854775746", "576460754450907132"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8646911282403868614", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"2", "-9222809086901354435"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9222809086901354433", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-9222809086364483648", "-9223372036854775808"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:7>", "-2147483648", "-2147483648", "186"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483649"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-70368744177664", "-4294967296"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-70373039144960", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"11", "-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-407", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<null>", "-524252", "2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:4>", "10", "-10", "524300"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4294967294", "2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6442450942", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483641", "-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"11", "2097198"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23069178", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"9223372036854775807", "-4611404543450677248"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611967493404098559", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-126"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("126", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"4611685466524094465"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"0", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"536870927", "2011"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("536872938", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"12", "70"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("840", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483614", "40", "2147483647", "-3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"106"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-106", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"0", "-1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<null>", "2147483647", "16391", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-70368744177664", "123"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8655355533852672", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1048855"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048855", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-277025390593", "-16388"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4539892101038084", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"0", "4294967245"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"277025390592", "-9222809086901354444"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9222808809875963852", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"4294967245", "4294967237"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"576460754450907165", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("576460754450907163", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-31"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483557", "-11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "70368744177664"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223301668110598144", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1073741830"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741830", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"219", "2147483604"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483385", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2", "1048536"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1048534", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"536870927", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152921536282230769", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-17591112302579", "536870927"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17591649173506", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775746", "-4294967294"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372032559808452", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"35184372088809", "-2147479552"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("35186519568361", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"536870911", "-2147483648", "-2147483648", "2097247"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1610612737", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1073741824", "-2113929216"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1040187392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"65546", "57"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65603", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-36", "-2", "536870911"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870869", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"2147483585", "-4294967244"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223371654602689740", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-1", "-2147483617"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483617", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483630", "-1048694"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2252053197879220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483648", "-65535", "2147483611", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483640", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147418112", "-2097247", "524260"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-403060", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483648", "1179671"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146303977", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1073741823", "-2147483600"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741777", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"524299", "-29", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("524299", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"1048576", "7", "1073479743", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1075052488", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-104", "4194267"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-436203768", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"536870927", "34603081"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18577388173526087", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"32212254781", "524239"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16886920234136659", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2", "-1073741823", "-524288", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-522242", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"1", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967294", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"1048520", "2097271"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"4294967294", "-262144"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1125899906318336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-38", "524295"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-19923210", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"8222", "-16380"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134676360", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483494", "2097138", "-524288", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3145560", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "8589934588"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372028264841220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372028264841100", "9007197107257345"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9214364831157583755", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1048576"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048576", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-1073741803", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741844", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"262144", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483647", "1073741887"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741760", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"0", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-1", "1073741695"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741695", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2097116", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097116", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"5", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2", "-524288"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048576", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-55", "-64424509442"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3543348019310", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1048600"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-24", "-9223372036854775807"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775783", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-524288", "44"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-340014", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:1>", "-2147483585", "63", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2147483587", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611685885283401789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "2097247", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"25", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"165", "10", "-2147483647", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483466", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"75", "-524288"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-39321600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2", "-2147483647", "-16386"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32770", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-131131", "181"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-131312", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"17", "4503599627370496"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("76561193665298432", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"171", "2097247"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("358629237", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2145386495", "-2147483647", "-2145386495"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2145386495", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-1073741823", "2147483630"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305842987738857490", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2097263", "-2145386495", "-1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1077936014", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2", "-67108738", "1073741887"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483611"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483611", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-1073741823", "-1073741759"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741759", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"26", "1048614", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146435060", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1073741887"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741887", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"20", "80"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147418073", "-524288", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418073", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483638", "8797166764062"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8795019280424", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"1073741854", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741854", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"1073741808"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-2147483648", "40", "536870960"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870920", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2147483381", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611685445049253888", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"536870963"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870963", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2097307", "-939524095", "74"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-937426863", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1073741811"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741811", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"1048648", "-2147483648", "2113582"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-4611685880988434434", "-9223372036854775746"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686155866341312", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483642"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483642", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-8", "16106127360"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16106127368", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"288230376151711681", "2147483902"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288230374004227779", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"264", "261", "0", "32"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-273804165147", "4294967245"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-278099132392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"69256347677", "536870927"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-526308", "1048599"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("690863", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2097152"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097152", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-551903293427", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-8589934593", "36507222016"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("27917287423", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2147483647", "268435454"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:9>", "2097198", "-9", "1073741823"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-1073741763", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305842877143449661", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"268435485"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435485", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"536870932", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-1073741824", "262130"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073479693", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4294967245", "288230376151711744"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288230380446678989", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"10737418299", "-53"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-569083169847", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"1048576", "2147483646", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"8858370044", "-9222809086834245632"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9222809077975875588", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"180", "524227"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("94360860", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-70368744177696", "4194322"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2147483710", "-2147483649"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967359", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9223372036854775699", "4573968371548160"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9218798068483227539", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"1073741822", "4718564", "-2147483648", "536870943"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-532152318", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<null>", "2147483647", "1048576", "1073741818"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2097193", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "7", "536870912"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483648", "67108990"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2080374658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-150", "549757910965"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-82463686644750", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"55", "524388", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146959315", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:6>", "536346624", "-1074266112", "2145386495"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"20", "2147483647", "268435456", "2147483617"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435505", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-1073741847", "-603979775"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1677721622", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1073741693"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741693", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-150"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-150", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-9007130535264274", "536870927"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9007129998393347", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"268435455", "-524288", "262130"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-519843", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<null>", "-1064", "43", "-1073741769"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-56", "-28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1073741854"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741854", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-1073741823", "-2147483586", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483622"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483622", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147481561"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147481561", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"2147483708", "536903695"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2684387403", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-140739635838984", "-4294967298"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-140735340871686", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-65538", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418109", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"17179869183", "9223372036854775807"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"70866960384", "2147614447"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("73014574831", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-70385924046848", "503316495"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-70385420730353", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-50", "562947805937664"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-562947805937714", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-3221225442", "-144115189149597696"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144115185928372254", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483647", "-2147483648", "-1073741857"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2145386490", "1048578", "1073743871"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072699392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
