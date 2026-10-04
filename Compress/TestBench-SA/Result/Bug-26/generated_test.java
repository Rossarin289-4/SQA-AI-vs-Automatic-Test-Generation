package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<empty>", "4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:0>", "-536866816"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:2>", "8024", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:3>", "4097"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:5>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "8024"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 120, 32, 9, 32, 121, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[108, 105, 110, 101, 49, 10, 10, 108, 105, 110, 101, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:0>", "<sample:2>", "4097"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<empty>", "4143"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "17592186046480"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:4>", "17592186046480"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "72057594037927936"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:0>", "4097", "4097"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:1>", "2147483641", "2047"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "closeQuietly", new String[]{"java.io.Closeable"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<sample:2>", "8025", "8174"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "9223372036854775807"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<empty>", "4096"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<empty>", "4096"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:4>", "<empty>", "8192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:4>", "<null>", "14336"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:4>", "<null>", "-14336"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:4>", "<sample:6>", "14376"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:0>", "1", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<empty>", "<sample:0>", "1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "4012"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:0>", "8024"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "8025"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "-34359730343"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 10, 98, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "18014398509483861"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<null>", "<sample:3>", "4095"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<empty>", "8025"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:0>", "8013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<null>", "<sample:0>", "8013"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<sample:0>", "8013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<empty>", "<sample:0>", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "4054"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "4054"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "4097"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:1>", "4063"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "4062"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "2031"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "1015"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "1015"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:0>", "<sample:2>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:2>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:0>", "8024"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:2>", "<sample:1>", "8536"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "549756864432"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "549622646704"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "8024"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<sample:2>", "-1", "8025"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:0>", "8024", "4096"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:8>", "1125900443705506"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:9>", "1125900443705506"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:1>", "<sample:3>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:6>", "2305843009209499602"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<null>", "2305843009209499602"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:9>", "2305843009209499602"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<null>", "10", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<null>", "4096", "4095"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:5>", "1125899906842625"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<null>", "8025", "8001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:2>", "4097"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:2>", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "skip", new String[]{"java.io.InputStream", "long"}, new String[]{"<sample:3>", "4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:0>", "268402678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<null>", "<sample:1>", "8023"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:2>", "4095"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 10, 49, 44, 50, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "toByteArray", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98, 62, 116, 60, 47, 98, 62, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:2>", "<sample:0>", "4097"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:9>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:1>", "1", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<sample:1>", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:3>", "<sample:1>", "8025"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:7>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<sample:4>", "63"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:8>", "<sample:4>", "63"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:6>", "<sample:1>", "16108"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:0>", "1", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:0>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream", "int"}, new String[]{"<sample:5>", "<sample:2>", "4097"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "copy", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<sample:5>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:1>", "1", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:2>", "0", "3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.IOUtils", "org.apache.commons.compress.utils.IOUtils", "readFully", new String[]{"java.io.InputStream", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:1>", "0", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
}
