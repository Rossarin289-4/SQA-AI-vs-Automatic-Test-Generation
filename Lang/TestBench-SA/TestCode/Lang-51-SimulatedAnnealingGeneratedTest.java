package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "<null>", "<null>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147483648", "2147483647", "268435463", "-2147483648"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "1", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-23", "-52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "2147483647", "10", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "2147483647", "10", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-1073741824", "10", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"0", "1", "-2147483648", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-1", "2147483647", "-52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "-52", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-2147483648", "-52", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"<null>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"on", "I", "Hello, World", "--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"2147483647", "0", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-23", "10", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"0", "10", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "524283", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1e10", ".5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-1048602", "-536870912", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870912", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-1073741824", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{".5c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "1", "-52", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "abj", "", "za\";1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "za\";1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1.12345678901234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-1073741824", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"off"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"on"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"10", "10", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"2147483647", "24", "2147483647", "1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"HH"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"on"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"no"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yes"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yer"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"trt>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "1", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x1F", "0x1F", "rr"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "1", "1", "-1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"0", "0", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yWs"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "a", "0x123456789", "1.1234567890123456"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"yes"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"trud"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "`", "<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "[1,2]", "2147483648", ".5c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "24", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"Ox"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "<null>", "1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"T{\010\010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"ttt>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "1", "<null>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "ttt>", "a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"Y\"r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "<null>", "2147483570", "4092"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-2147483648", "2147483647", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"Trt>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-1", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<null>", "true", "trud"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"Tru>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"TruE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "\t", "-1.5", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<null>", "1x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"-2147482624"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "no", "123456789012345678901234567890", "2020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"000"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"0", "1", "-2147483640", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"on", "I", "Hello, World", "--1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-1073741824", "10", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1073741824", "20", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"10", "-46", "0", "524236"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "I", "-1.01.5e300", "Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "I", "-1.01.5e300", "010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.01.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1e10", ".5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"-2147483648", "1", "2097135", "-2147483648"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "10", "-1073741841", "28"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1073741824", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1073741856", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741856", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147483584", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483584", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483584", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "PT1H", "--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "PT1H", "--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "T11HE", "--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T11HE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", " ", "r--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "1.5e300", "r-}-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "1-5e300", "r-}-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "1-5e300", "I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-16", "-47", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-279", "-47", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-279", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-558", "8388561", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-558", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-279", "8388561", "-1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388561", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-678", "8388561", "-536870866"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "268435463", "268435463"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435463", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "536870926", "536870926"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870926", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "<null>", "536870926"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "10", "268435444"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "2147483647", "268435444"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "1073741823", "268435444"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483648", "268435444"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483638", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483638", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483635", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483635", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147475443", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147475443", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-23", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-23", "-20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-23", "-52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "23", "76"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-1", "65537"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65537", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "65535", "32760"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32760", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483648", "10", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1073741824", "10", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"<null>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "\t", "12:30:45", "no"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "\t", "12:30:45", "no"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "\t", "12::30:45", "mPo"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12::30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "\t11L", "12::30:45", "mPo"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t11L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "\t11K", "12::30:45", "mPI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t11K", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "\t11K", "12::30:455", "mPI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12::30:455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "\t11K", "12::30:4552020-02-30T25:61:61", "mPI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12::30:4552020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "\n11K", "12::30:4552020702-30T25:61:61abc", "mPI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n11K", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-52", "0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-2097204", "-2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097204", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-1048602", "-2147483648", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048602", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-1048602", "536870912", "-36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870912", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2113588", "268435456", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2113588", "268435467", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435467", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2113588", "2147483647", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2113588", "2147483613", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483613", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "\t", "-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "f", "-:.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "g", "-:.0l"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("g", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "10", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "8", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "16", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "10", "268435463"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "268435463", "268435463"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435463", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483638", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483638", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483639", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483639", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483635", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483635", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147475443", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "1073737721", "-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"-536870912", "1", "-52"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"-536870912", "1", "-52"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "<null>", "2147483647", "-1073741824"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "false", ".5c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "false", ".5c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "famsee", ".5c8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("famsee", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "famsfe", ".5c8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("famsfe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-52", "-536870912"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-52", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-52", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-128", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-256", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-255", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-2147483647", "1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"-1048602", "536870855", "-1048602"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "-2147483648", "-23", "-1048602"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048602", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "-2147483648", "-23", "-2097204"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097204", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "-2147483648", "1", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "I", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "<null>", "<null>", "-1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.s", "1 .2234567", ".1a+b,c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "2147483647", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-536870912", "10", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "268435463", "-13", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "268435463", "-13", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435463", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "268435463", "-6", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "268435463", "-6", "-1073741831"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "268435463", "-6", "1082130490"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435463", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-268435463", "-6", "1082130490"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435463", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1", "-6", "1082130490"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "2147483647", "-6", "1082130541"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
