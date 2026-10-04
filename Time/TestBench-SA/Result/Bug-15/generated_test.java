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
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"4294967292"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-1", "-9223372036854775808"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775805", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"12", "9223372036854775807"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"1", "-9223372036854775807"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "-2", "-1", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "-2147483648", "-1", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483646", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "128"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2147483647", "28"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2147483647", "56"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"i", "2147483647", "28", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"Hello, World", "-1", "56", "-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483648", "2147483646", "2147483647", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"0", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"64", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-64", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483583", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:7>", "0", "2147483647", "28"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:7>", "2147483647", "2147483647", "-64"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483648", "9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372034707292159", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-2147483648", "64"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"268435328", "-2147483646"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:3>", "28", "64", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:6>", "2147483647", "2147418111", "28"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"0", "2147483647", "-2147483647", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"64"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{" h- ", "-2147483648", "-2147483648", "-64"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"268435328", "2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("576442884979425408", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"1099511627798", "2147418111"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<d:1.5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"0", "268435328"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"137438953496", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-549755813889", "2147483639"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-547608330250", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-549756076033", "2147483639"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-547608592394", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-549756076033", "2147483593"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-547608592440", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-549756076048", "2147483593"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-547608592455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2147483649", "2147483593"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2147745793", "2147483593"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-262200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-2", "2147483593"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483591", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"2", "2147483593"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483595", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"70368744177625", "-2147483638"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("70366596693987", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"140737488355250", "-2147483609"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140735340871641", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"140737488355250", "66571993127"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140804060348377", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"70368744177625", "66571993127"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("70435316170752", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "-2147483648", "-1", "268435466"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435466", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "2147483647", "-1", "268435466"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435465", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "-2147483648", "268435466"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048183", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "-2147483648", "268435482"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048167", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483607", "2147483647", "-2147483648", "268435482"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048207", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483607", "-2147483648", "-2147483648", "268435482"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048206", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-2147483648", "-2147483648", "268435482"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048166", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"56", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"28", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"28", "32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("896", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"28", "-32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"56", "-32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1792", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483648", "2147483647", "-11", "20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"0", "2147483604"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483604", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"128", "-2147483649"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4503601774854197", "4294967304"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503606069821501", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4503601774854197", "8589934608"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503610364788805", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4503601774854197", "288230384741646352"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("292733986516500549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483641", "-4194304", "128", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1069547641", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-2", "128"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-2", "2147483558"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4303355965", "-9223372036854775808"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372032551419843", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"8606711930", "-9223372036854775808"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372028248063878", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-4303355965", "-9223372036854775754"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-4303355965", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4303355965", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-4303355965", "-39"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4303356004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"9223372036854775807", "-39"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775768", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"4611686018427387903", "-78"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387825", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"9223372036854775807", "-9007199254741070"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9214364837600034737", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"4294967292", "-9223372036854775807"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<null>", "-2147483648", "-2", "87"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "-1", "64"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:3>", "-1", "64", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<null>", "-1", "2147483647", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "56", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:1>", "56", "10", "1073741819"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<sample:7>", "64", "2147483647", "-58"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"true", "1", "2147483647", "56"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"140735340871634", "2251804108652582"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2392539449524216", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{" 5hjda-3.0", "-2147418130", "2147483646", "2147418111"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"1.5e300", "64", "-67", "2147483647"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-2147483647", "-32"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-18014399046352846", "128"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-18014399046352974", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"18014399046352846", "128"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18014399046352718", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"18014399046352846", "-576460752303423616"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("594475151349776462", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"18014399046352846", "-288230376151711808"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("306244775198064654", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9007199523176423", "-288230376151711818"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("279223176628535395", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9007199523176423", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9007197375692775", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-2", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-2", "-4026531840"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4026531838", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:7>", "-2147483640", "-16777244", "-92"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:7>", "2147483647", "-16777244", "2147483647"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-4611686018393834472", "4294967271"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-4294967337", "262136"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1125865557851832", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-130996502528", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387904", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483664", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686052787126272", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"128"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-79", "9223372034707292159"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372034707292080", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777295", "9223372034707292159"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372034690514864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777310", "4611686016279904255"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686016263126945", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777310", "4611686016279904319"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686016263127009", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777351", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2164260999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777351", "-2147483662"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2164261013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-16777351", "1097364144114"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1097347366763", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"long", "long"}, new String[]{"-8388675", "1097364144114"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1097355755439", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967294", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2", "2147483592"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967184", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-2", "1073741796"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483592", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"2147483648", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-1", "-23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"-2", "-23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "-2147483648", "-1", "268435466"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435466", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2214592574", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2214592574", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"9223372036854775807", "128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483648", "128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483520", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483648", "107"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483541", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"2147483648", "-524181"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2148007829", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"4294967296", "-524181"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4295491477", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"4294967296", "-1048362"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4296015658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"2147483646", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686011984936962", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483648", "2147483647", "-2", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483625", "2147483647", "-5", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483616", "0", "128", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483616", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483616", "-4194304", "128", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2143289312", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483641", "-4194304", "128", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2143289337", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483641", "-4194304", "128", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1069547641", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"0", "64", "-64"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<null>", "2147483647", "-2", "24"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:1>", "-1", "-72", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-16348"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16348", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-43"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-104"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("104", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483635"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483635", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483604"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483604", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"1", "28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"1", "91"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("91", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-1", "91"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-91", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-1", "28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"17", "28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("476", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"17", "-6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-102", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"28", "58"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1624", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-268435328", "2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-576442884979425408", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-536870656", "2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152885769958850816", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-536870716", "2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152885898803937476", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"-536870716", "-2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152885898803937476", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"1073741432", "-2147418111"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305771797607874952", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"1073741432", "-2147418054"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305771736404613328", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"536870716", "-2147418054"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152885868202306664", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"1073741432", "-2147418051"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305771733183389032", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiplyToInt", new String[]{"long", "long"}, new String[]{"1", "-16381"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16381", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418111", "1", "-64", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418112", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"12", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("25769803764", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"48"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"24"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483672"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483630"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"65"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"95"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("95", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483646", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483646", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483646", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483584", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483584", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1073741823", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1107296255", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1107296255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"10", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"30", "28"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("840", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"30", "56"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1680", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"1", "4294967292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967292", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"128", "4294967292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("549755813376", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"268435328", "4294967292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152920953777291776", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"268435328", "4294901756"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152903361599635968", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"0", "137438953496"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-17592186044416", "137438953496"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-9223372036854775747", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775747", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147418111", "1", "56"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"28", "1", "56"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-46", "56"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-46", "56"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"-a/b", "32760", "56", "2147483647"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"12", "9223372036854775807"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775795", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-2", "9223372036854775807"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-128"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"64"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"65"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"-2145386496"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386496", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483648", "18"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483630", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-17317308137355"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<sample:4>", "-2", "2147483647", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<null>", "0", "1073741823", "-2147483619"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeFieldType", "int", "int", "int"}, new String[]{"<null>", "-2147483648", "-1", "16524"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-64", "-2", "-2", "-64"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "2147418173", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147481724", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418111", "-1610612744", "2147483647", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418131", "-2147483648", "-1", "2147483390"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147417875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418131", "-2147483648", "-2", "2147483390"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147417876", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418131", "-2147483648", "-2", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418133", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"2147418131", "-2147483648", "-4", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418135", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483586", "1073741824", "-2147483648", "2147418111"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483586", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483586", "1073741824", "-1073741824", "2147418111"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741762", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-131073"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-281477124194304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-139234"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-299002738245632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-69617"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-149501369122816", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "int"}, new String[]{"2147483648", "-1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305843009213693952", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"56", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"1073741857"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741857", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-1073741857"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741857", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-536870928"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870928", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeToInt", new String[]{"long"}, new String[]{"-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-1", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"0", "-2147483647", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483638", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-83", "79"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6557", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-2147483648", "79"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"-134217672", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217672", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"10", "-562"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5620", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"6", "-562"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3372", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"int", "int"}, new String[]{"6", "-1124"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6744", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"java.lang.String", "int", "int", "int"}, new String[]{"abc", "-2147483648", "-2147483647", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "verifyValueBounds", new String[]{"org.joda.time.DateTimeField", "int", "int", "int"}, new String[]{"<null>", "-67108827", "-12", "-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-134221774", "-1073741794"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144119528408622556", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-67110887", "-1073741794"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72059764204311278", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-67110887", "-1073741807"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72059765076752809", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-67110833", "-1073741807"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72059707094695231", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-67110833", "-2147483614"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144119414189390462", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"-67110895", "-2147483614"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144119547333374530", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeMultiply", new String[]{"long", "long"}, new String[]{"17592455536572", "128"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2251834308681216", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeNegate", new String[]{"int"}, new String[]{"16"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"14", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"14", "-48"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-2147483648", "-48"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"-1073741824", "-48"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741872", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"536870912", "-48"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"536870912", "-40"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870872", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-40"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483607", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775747", "-9223372036854775747"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775791", "-9223372036854775749"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-42", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeSubtract", new String[]{"long", "long"}, new String[]{"-9223372036854775791", "-9223372036854644677"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-131114", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483646", "-2147483647", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483646", "-2147483647", "-2147483645"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-1073741824", "-1073741768", "1073741860"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741805", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-1073741768", "1073741860"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-1073741768", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147418111", "-1073872869", "2147483617"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147418111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147418111", "-1073872869", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073676315", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147418111", "-1073872869", "-45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073676360", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-1073872869", "-90"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073610869", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "getWrappedValue", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-1073872869", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"1073741834", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741814", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483625"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.FieldUtils", "org.joda.time.field.FieldUtils", "safeAdd", new String[]{"int", "int"}, new String[]{"2147483615", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-33", String.valueOf(actual));
 }
}
