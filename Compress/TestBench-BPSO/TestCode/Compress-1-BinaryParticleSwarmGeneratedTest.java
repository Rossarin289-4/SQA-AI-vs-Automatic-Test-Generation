package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "2147483647", "-8388603"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"32767"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<null>", "1073741823", "80100"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-23", "-2147483640"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "160200", "46"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "2147483647", "-2147483648"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2147221503"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "-2", "23"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:3>", "16", "2147483632"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:12>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "29172", "10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-8388603"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-2147483640"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "-2147483633"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741823", "29095"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "49"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "11", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "2", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "160200", "160200"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "14564", "2"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1073741823", "12"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-8388603"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:12>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "1072693236"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "28103", "-8388655"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "34"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "-1", "-1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "536870911"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "4194228", "33714632"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-5", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "0"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "0", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2147483640"}}, 2);
  assertNull(actual);
 }
}
