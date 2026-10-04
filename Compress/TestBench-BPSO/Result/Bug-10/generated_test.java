package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"`"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", "java.lang.String", "abo"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"]6?"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"aIc"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
}
