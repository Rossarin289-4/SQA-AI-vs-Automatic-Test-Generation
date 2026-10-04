package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"fakse"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2147483648", "-37", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"onfalse"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "2147483647", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1E-F", "0L", "1.1234567890123456", "1.1234567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "sque", "1.12345678901234561.12345778901234567"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"11", "1", "2147483644", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "2147483647", "-36", "-67108866"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"49", "2147483637", "31", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-1", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"1L5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "-22", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147483600", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "28", "1610612735", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "0", "-2147483645", "-1073741818"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741818", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"10", "2147483647", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"-2147483645"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"on"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"10", "10", "-2147483648", "15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-79", "2147483647", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-79", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"2147483647", "2147483647", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-31", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"2147483647", "1610612735", "2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"<null>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yet"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147483648", "-2147483648", "-2147483624", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"on"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147483648", "1", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147483648", "5", "-1073741824", "-2147483648"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x1F", "{\"a\":1}/a/b", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-4194304", "<null>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"TILE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"-37", "0", "2147483637", "-37"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"2147483647", "2147483647", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-2147483588", "-64"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"yes"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"15", "-36", "15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"no"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yft"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"0", "-2147483647", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "-2147483647", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"om"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"tque"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "TILE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"off"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1{5W", "1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "1/2", "PT11H", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1E.5", "11/5", "a0b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"tr0e"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"trud"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "[1,2]", "e{5W", "1.12X45678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "<null>", "2147483647", "-4194304"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "trud010", "", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "<null>", "39"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"truE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"<null>", "39", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yEs"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<null>", "1.112345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "37", "0", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"10", "2147483644", "6", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "1", "2147483647", "-42"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"11"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147483648", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{"123456789012345678901134567890"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"2147483645"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "2147483590", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483590", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a b1.5d", "", "010", "010"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"100", "10", "-2147483648", "13"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"16777179"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147483616", "2147483606", "-20"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-1", "2147483647", "2147483647", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"0", "-18", "-1073741824", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"true", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "-2147483648", "-2097108"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"-2147221504", "-4", "94"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "1K2147483648", "\u00e9nu"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1K2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "24", "-2147483648", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"-36", "16361", "2147483647", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"1", "1073741800", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "", "", "1/5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "negate", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-1073774586", "15", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"-67108866"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<2>b</a>\n", "", "[1.1234567990123456"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"2147483647", "-1610612736", "1077936126", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "0", "-134217708", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217708", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "1-0.0", "a b1.5d", "1/5\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "2147483647", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "49", "60", "-1073741818"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"no", "on", "p\t", "1.25"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "a,bC,c", "010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,bC,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.12345678901234561.12345778901234567Array is empty", "1La b", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1La b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-3", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-2147483648", "-67108866"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "62", "-8", "1073741818"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-2147483648", "-27", "-2147483645"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "1610612735", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"boolean[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.6e300", "1.5p+1", "-1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5p+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.5fPT1H", "IB", "1-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "-0.<01E-5", "202;0-01-01", "[Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.<01E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483648", "-28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-76", "11", "-128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "1LD", "rray is empty1.12345678", "s-qu8e"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1LD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "23", "-80"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147483648", "1610612735"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1610612735", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-2147483392", "-18", "-975"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "1.5dL", "aa", "1.225"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5dL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-3", "-14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2147483648", "-30", "-37"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "10", "94", "47"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("94", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "-7", "-1073741818", "-2146959360"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "\u00e9o\"false", "", "0w123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9o\"false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "1610612731", "-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1610612731", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "-18", "-1073741823", "-20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "1619001343", "-46", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1619001343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "fCal", "Array is empty", "Titlf"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Array is empty", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "2L", ",0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "11/", "Titmf"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "28", "28", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-2147483648", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-11", "25", "11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-33554401", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "0", "18", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "1.5", "[1,3]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-1879048168", "10", "2147483601"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1879048168", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "bbctrue", "a,b,,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "Array eis empty/a/b", "1/5\"on"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Array eis empty/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "113", "20", "-2147483624"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "2020-01-011.12345i7", "2/6\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/6\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "1E-F", "a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"yes"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"true", "4097", "24", "-131071"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4097", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"false", "-2147483648", "2147483645"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483645", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "<null>", "-26", "22"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"int", "int", "int"}, new String[]{"-31", "-31", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanDefaultIfNull", new String[]{"java.lang.Boolean", "boolean"}, new String[]{"false", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-2147482624", "128", "-37"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "ab2", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "14", "-8", "8"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isTrue", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBoolean", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a,be,c", "I-1.5on", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "0y123456689", "\u00e91.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e91.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483600", "1073741823", "-29"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "2147483647", "11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "-16", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-2147483647", "2147483647", "-2147483624"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"true", "-2147483647", "-2146435048", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringTrueFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"<null>", "2147483647", "8388618", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int"}, new String[]{"-134217732"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1fE-55", "Hello, Worl", "8"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Worl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "-79", "524299"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("524299", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"false", "2020-02-30T25:61:61", "1L5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isFalse", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "262107", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262107", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"boolean", "java.lang.String", "java.lang.String"}, new String[]{"true", "zesa,b,c", "1E-F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("zesa,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-15", "31", "43"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean", "int", "int"}, new String[]{"true", "0", "-39"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.123456789/1234567010", "-.6", "\u00ea"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "isNotTrue", new String[]{"java.lang.Boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.c5f", "1.1234567890123456yes", "{\"a\":1}/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456yes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"false", "1.240x1F", "Af5d", "1L5ino"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Af5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringOnOff", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "28", "-39"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toStringYesNo", new String[]{"java.lang.Boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "xor", new String[]{"java.lang.Boolean[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483647", "1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"java.lang.Boolean", "int", "int", "int"}, new String[]{"false", "-32", "8", "-3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toBooleanObject", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"abc", "http://example.com/a?b<c", "UITLEHello, World", "Title"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toString", new String[]{"java.lang.Boolean", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "TITK4", "Hello, World", "nn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITK4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"boolean", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toIntegerObject", new String[]{"java.lang.Boolean", "java.lang.Integer", "java.lang.Integer", "java.lang.Integer"}, new String[]{"false", "2147483647", "2147481599", "-2147483624"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147481599", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "toInteger", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
