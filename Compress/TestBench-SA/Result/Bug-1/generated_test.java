package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1", "10"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<null>", "29126", "29126"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "29128"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "2147483647", "10"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "29128", "10"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<null>", "-2147483648", "-2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-53"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "29128", "29126"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "29126"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "29128"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-2147483648"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "29148", "-2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "0"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-29112", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "0"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "2146435071"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "29128"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "29126"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "29128", "1"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", new String[]{"org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-53", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1034"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483610", "29156"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "20"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putNextEntry", "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2);
  assertNull(actual);
 }
}
