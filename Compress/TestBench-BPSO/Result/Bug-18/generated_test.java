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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "17", "268435476"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "0y1F"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}), new String[][]{{"getUserName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "24"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "1.25", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"0ybFF", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{" bytet:)", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"Hello, Workd", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4398048608254"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2097152"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "0x1234b6789"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=0x1234b6789, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDe...#275#1148168723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"VTF-8", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-268435472"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-20"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "x", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"UTF-8", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "1048630"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2097150"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "986"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "5-", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "16"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:5>", "1.\n5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=1.\n5/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=f...#268#583644993", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "2147483600", "500"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"1048575"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "requost to write '", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"8589934591a", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"0x1F", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-9218868437227405312"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "2147483647", "2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2146959359"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "//--1"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:4>", "2002", "17"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=//--1, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=f...#269#-1796135524", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "./PxHeaders-X/"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "1", "<sample:3>"}}, 1), new String[][]{{"isCharacterDevice", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"-1000"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-18"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "1", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "pash", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:6>", "null"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "0L1F", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=null/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=fa...#267#1635205499", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2097151"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "0xFFlFFFFF"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"123456789012345668901234567890", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:8>", "0x122456789"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "24"}}, 2), new String[][]{{"getUserName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"268435460"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "TITLE"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "8589967339"}}, 2), new String[][]{{"isCharacterDevice", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "' is to long (!> ", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{" bytes)", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"2020-01-01/", "<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"' bytes for entr", "<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:5>", "020"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "<", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=020/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=fa...#267#1662111723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "978"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{".5010", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:5>", "-0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=-0/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=fal...#266#126673542", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-2097187"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "0y1F"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"4194242"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", " bytet:)"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"268435472"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "4"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "1048575"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934591"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"3", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "1048575"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"2020-02-30S25:61:61", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{".", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{".501g0", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2097196"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"999"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "2020-02-30S25:61:61"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-8171"}}), new String[][]{{"setUserName", "java.lang.String", "5"}, {"isBlockDevice", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"76"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"982"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "/a///b"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "8"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}), new String[][]{{"getMode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "./PaxHeaders.XX/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/, getRealSize=0, getSize=0, getUserId=0, getUse...#295#-582213534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"66"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1073741888", "0"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "0", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "mtid"}, false), new String[][]{{"getGroupId", "", "7"}, {"getLastModifiedDate", "", "1"}, {"getDate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"0x133456789", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "PT:1H"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=PT:1H, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=f...#269#-1418163360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "268959769"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "34", "-29"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "'"}, false), new String[][]{{"getDevMajor", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"999"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4297064448"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2097177"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "-0.0"}, false, 6, new String[][]{}), new String[][]{{"writeEntryHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-19", "3"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "ITitle"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}), new String[][]{{"isDescendent", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:6>", "k1.5d"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "21474836481L"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "116"}}), new String[][]{{"setDevMajor", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=1, getDevMinor=0, getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=k1.5d/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=f...#268#139971242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2097098"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "' is too lonu ( > ", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "4194304"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-4611686018427387904"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "1.5e"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"3", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "1L"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 2), new String[][]{{"getDirectoryEntries", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-2"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-6"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "48"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"01/", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"5-", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"-38"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:4>", " 011"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "true1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"/a/b", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-1008"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "2020-02-39T25:61:61"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "a"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 2), new String[][]{{"getGroupName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "1.2D"}, false, 0, null, 3), new String[][]{{"getDevMinor", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", ".../@LongLiok"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "-2147483648", "-9"}}, 2), new String[][]{{"writeEntryHeader", "byte[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "-2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-1998"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "\n"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 1), new String[][]{{"setIds", "int,int", "7"}, {"getDirectoryEntries", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "0x1F"}, false, 0, null, 2), new String[][]{{"getSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1L"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-8589934590"}}), new String[][]{{"setSize", "long", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=1L/, getRealSize=0, getSize=1, getUserId=0, getUserName=root, isBlockDevice=fals...#265#-1352221688", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "q", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2097091"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "72057594037927999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "980"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-4611686018427387904"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "{\"a\":1}"}, false, 0, null, 2), new String[][]{{"isPaxHeader", "", "3"}, {"getDevMajor", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"Hello, World", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-70"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "a,b,c"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:5>", "267913232", "67109863"}}, 3), new String[][]{{"isDescendent", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "7"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1073741823", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1001", "24"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "268435480"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"-2147483634"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "2", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"a", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"4"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"950"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "-25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"java.lang.String", "java.util.Map"}, new String[]{"OT1H", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "acc"}, false, 0, null, 1), new String[][]{{"setModTime", "long", "2"}, {"getLinkName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"1000"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "' bsfore the '"}, false, 0, null, 3), new String[][]{{"getDevMinor", "", "2"}, {"getLinkName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"1114112"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-8387608"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4611686018427387862"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-1029"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"1006"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1036", "2147483599"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"6"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "=PT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "18874366"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}}, 1), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=PT1H/", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", " ", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "linkpatX"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}}, 3), new String[][]{{"getRealSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "null0L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"32"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:5>", "request to write\037'abc"}, false, 0, null, 3), new String[][]{{"writeEntryHeader", "byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "a,b,cm", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-268435460"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1i.12345678Title"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "131052"}}, 3), new String[][]{{"getDirectoryEntries", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1998"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:7>", "rize/"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 1), new String[][]{{"getRealSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "268959760"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "2147483618", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "26", "-2147483648"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2097150", "-2147483647"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1073741823", "5097"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:5>", "/010mtime"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 1), new String[][]{{"getLinkName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "1835007"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "2147483648", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "984"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1610612724", "-2147483600"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"134217744"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "268435471"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "-1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "0x1F", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934590"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", "0ybFF"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "2147483648-1", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=0ybFF, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=f...#269#1593667476", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"-7"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "1", "4"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934592"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "1048578"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-33554442"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "010"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "134217736"}}, 3), new String[][]{{"setNames", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=a, getLinkName=, getMode=33188, getName=010, getRealSize=0, getSize=0, getUserId=0, getUserName=, isBlockDevice=false,...#264#-1100924587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "mtime"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "java.lang.String,java.util.Map", "reruess to write '", "<sample:3>"}}, 1), new String[][]{{"getLinkName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-549755812887"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2097128"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"489"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "17404"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "1000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
}
