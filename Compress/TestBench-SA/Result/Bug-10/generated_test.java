package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"UTF8"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b==c"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEncoding", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"55336"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", new String[]{"java.lang.String"}, new String[]{"65535"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntry", "java.lang.String", "nukl"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "getEntries", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "finalize", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipFile", "finalize", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}, {"org.apache.commons.compress.archivers.zip.ZipFile", "getEntriesInPhysicalOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile", "closeQuietly", new String[]{"org.apache.commons.compress.archivers.zip.ZipFile"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
}
