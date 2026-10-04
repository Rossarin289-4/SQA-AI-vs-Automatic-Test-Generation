package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<null>", "130", "16384"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:2>", "<sample:3>", "4011"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:0>", "<sample:0>", "2047"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<empty>", "-2147483648", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:4>", "576531121047605247"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "4096"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<empty>", "288230376151721815"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:7>", "4097"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:0>", "4089", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<null>", "-19", "8192"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:7>", "72057594037935961"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:9>", "8589934592"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "-9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:0>", "<sample:3>", "-42"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<empty>", "<sample:3>", "-2147483648", "148"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:3>", "8192", "4217"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "2251799813689344"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:4>", "-9221120237041090559"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "4611686018427395928"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "8017"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "2199023259649"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "2251799813687296"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:8>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:9>", "4095"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "4611686018427387903"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<null>", "8207", "4042"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:2>", "8057"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "-4611686018427387904"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:9>", "576531121047605247"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "9223372036854775807"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[108, 105, 110, 101, 49, 10, 10, 108, 105, 110, 101, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "8190"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<empty>", "<sample:0>", "2147483647", "-4186278"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:9>", "<sample:8>", "8237"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<empty>", "-2147483645"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "4057"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:1>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:3>", "4217"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "4098"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[123, 34, 97, 34, 58, 49, 125]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "16048"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:8>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:0>", "<sample:1>", "4217"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<null>", "8024"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:7>", "<sample:2>", "4150"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:4>", "8192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:2>", "8023"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "9223372036854775807"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "2097153"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<sample:2>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "49"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "8072"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "8050"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "4012"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<null>", "16384", "23"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 120, 32, 9, 32, 121, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:9>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<sample:3>", "-4095"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:0>", "268439552"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "4097"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<sample:3>", "1052729"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:3>", "2108"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:8>", "576531121047605247"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<null>", "<sample:0>", "8025"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:7>", "<sample:3>", "8192"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:9>", "<null>", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:2>", "<sample:2>", "2113200"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:4>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:3>", "0", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:1>", "8033"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:2>", "20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:4>", "<sample:1>", "2108"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:2>", "<sample:3>", "4097"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:7>", "<sample:0>", "536870911"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:2>", "2108"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<empty>", "<sample:2>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<sample:1>", "4139"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<empty>", "0", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:1>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<sample:0>", "4089"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:0>", "4054"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<sample:3>", "4096"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:1>", "8536"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:6>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:2>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:8>", "<sample:3>", "12255"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
}
