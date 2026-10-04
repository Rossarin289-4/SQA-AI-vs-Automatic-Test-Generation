package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"a,b,c", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"a,b,,c", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"ax,,c", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<null>", "<null>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-1", "0", "<sample:0>", "255", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-1", "0", "<sample:0>", "255", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{",-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "254", "<sample:1>", "10", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483565", "263", "<sample:1>", "-1048566", "207"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483565", "204", "<sample:3>", "-1048534", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.<2", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"0x:2?456789", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"0x:2?456789", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0SS"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 83, 83]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 53, 102]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1=5f"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 61, 53, 102]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 97, 47, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"/ /b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 32, 47, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"/  /b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 32, 32, 47, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"//  /b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 47, 32, 32, 47, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[91, 49, 44, 50, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "256", "-2147483565"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "256", "-2147483565"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "254"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<empty>", "256", "-1", "<sample:0>", "10", "0", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "64", "-3", "<sample:0>", "10", "0", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1..5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 46, 53, 102]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 48, 46, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"-0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"-/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "256", "<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "256", "<sample:2>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "1", "<sample:1>", "1", "-2147483565"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"x", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"x", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "-1048534", "204", "<sample:1>", "204", "-2147483648", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "0", "0", "<sample:3>", "1073741859", "1", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "0", "2147483647", "<sample:3>", "1073741859", "1", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"PT1H", "<sample:3>", "1", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"PT1H", "<sample:3>", "-20", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"PT1H", "<sample:0>", "-20", "70"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:6>", "1", "2147483634", "<sample:1>", "-2147483648", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:6>", "1", "2147483634", "<sample:1>", "-2147483648", "131071"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2", "-1048534", "<sample:2>", "-1048534", "-1048534"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2", "-1048534", "<sample:2>", "-1048534", "-1048534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2", "-1048534", "<sample:2>", "-1048534", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"[p1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[p1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"abcTITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abcTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"a1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\t0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- 9223372036854775807 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- 9223372036854775807 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<null>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "20", "-268402943"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0--15."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0--15.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0--15.2020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0--15.2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:3>", "1048695", "16777388", "<sample:1>", "304", "1073741837"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006\007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483576", "-1073741824"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1234567", "<null>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<empty>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "77", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "6"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "-524282"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "22"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "110", "2147483647", "<sample:1>", "204", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<empty>", "1073741790", "-1073741807", "<sample:2>", "2147483647", "0", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "1073741790", "-1048534", "<sample:2>", "2147483647", "0", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "2147483647", "204", "<sample:0>", "256", "256", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "1", "<sample:2>", "254", "254"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2147483565", "256", "<sample:0>", "2147483647", "204"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483565", "256", "<sample:0>", "2147483605", "204"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "-1", "<sample:0>", "1", "255"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t0x123456789", "<empty>", "2147483647", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "255"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "255"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "-255"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"9a,b,cUS.ASCII"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[57, 97, 44, 98, 44, 99, 85, 83, 46, 65, 83, 67, 73, 73]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "279", "134", "<null>", "-524270", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<empty>", "2147483647", "-2147483648", "<null>", "376", "-2147483648", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "-2147483648", "204", "<sample:2>", "2147483647", "256", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "10", "-1", "<sample:3>", "204", "255"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\n,0101.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?,0101.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\n,001.1234T5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?,001.1234T5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\n,001.1244T5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?,001.1244T5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\n,001.1234T50.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?,001.1234T50.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "51", "-2147483648", "<sample:1>", "-2147483648", "-1572822", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"12:3L045", "<null>", "-2147483648", "204"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"12:3L045", "<null>", "-2147483648", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"axW,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("axW,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"ax,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ax,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       7 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1234577890123456 ", "<sample:2>", "-2147483648", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 44, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"aa,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 44, 98, 44, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"Tite"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tite", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"Tise"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tise", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"ise"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ise", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2097023", "51", "<null>", "2147483647", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:3>", "10", "254", "<sample:3>", "0", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0x4FFFtEFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 52, 70, 70, 70, 116, 69, 70, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaDaaaaaaa`aaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 68, 97, 97, 97, 97, 97, 97, 97, 96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaaaDaaaaaaa`aaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 68, 97, 97, 97, 97, 97, 97, 97, 96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"--1", "<sample:3>", "204", "-1048534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{",", "<sample:0>", "1073741823", "1048433"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "10", "-1048534", "<null>", "-1073741794", "-2147483648", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       6 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\u00e9Title010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9Title010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"-80"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 56, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"r80"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[114, 56, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"r801.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[114, 56, 48, 49, 46, 49, 50, 51, 52, 53, 54, 55, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"\t0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789/12345678901234567890", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\t+Bc3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?+Bc3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"u.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 46, 53, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"u"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"jHelko, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jHelko, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "348"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<empty>", "<empty>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "206"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "2147483647", "-2147483565", "<sample:2>", "51", "-2147483565", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1235688"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 51, 53, 54, 56, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"PTH"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 84, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t", "<null>", "254", "1572822"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "-2147483648", "-67104768", "<null>", "-2147483648", "0", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "-2097080", "0", "<sample:3>", "-524267", "0", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-1073741782", "-2147483648", "<sample:2>", "-1572822", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1073741824", "-1073741824"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<null>", "<empty>", "2147483647", "255"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1", "<null>", "0", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "102"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "255", "<null>", "-1048534", "51"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483638"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:1>", "-1048534", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "51", "-2147483648", "<sample:0>", "-1048534", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "256", "-2147483648", "<null>", "-1", "204"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-1", "<sample:3>", "256", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "517", "<empty>", "-2147483648", "252"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-1", "<sample:1>", "51", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "254", "2147483647", "<sample:1>", "255", "254"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "0", "-262068", "<null>", "-1572822", "32", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "-1572822", "-2147483648", "<sample:0>", "-2147483608", "-2147483648", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<null>", "2147483647", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483607", "0", "<sample:5>", "254", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "1", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:0>", "10", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<null>", "-254", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:8>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483627", "-2147483648", "<sample:1>", "-2147483648", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
}
