package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-67108825", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1. 5d"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:14>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "' closdd a'i ttoo long ( d .2147483A48"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "-2147483648", "2130706432"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2147483647"}}, 2), new String[][]{{"getFile", "", "5"}, {"isDirectory", "", "5"}, {"length", "", "2"}, {"canExecute", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:14>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2130706432"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "134217666"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=true, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacterDevice=false, ...#264#-136209249", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "0y"}, false, 0, null, 2), new String[][]{{"isDirectory", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=8, getCount=8, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=32, getCount=32, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=200, getCount=200, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "1.1234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "1.1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "33554430"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "+1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-4602678956611600469"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "1", "2130706432"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2130706432"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2130706432"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2130575360"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-2130575360"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-520093710"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ".1.5"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3), new String[][]{{"isFIFO", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ".1.5"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3), new String[][]{{"isFIFO", "", "7"}, {"getRealSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ".1.5"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3), new String[][]{{"isFIFO", "", "7"}, {"getRealSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ".1.5"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3), new String[][]{{"isFIFO", "", "7"}, {"getRealSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "20", "-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "EE1"}, false, 0, null, 1), new String[][]{{"getGroupId", "", "4"}, {"getLastModifiedDate", "", "1"}, {"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "EE1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1.5d"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1.25"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2130706387", "2130706432"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "2", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4261412809"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "-14", "3"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2130706387"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=true/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacterDevice=false, ...#263#-1442379314", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2130706432"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "--1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "2020-02-30T25:61:61"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "2020-02-30T25:61:61"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"44"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2130706432"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2130706432"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "1", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2130706387"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=a,b,c, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacterDevice=false,...#265#-1599800205", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"43"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2130706387", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "134217666"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-43"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "request to write ' "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "-1.5"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}), new String[][]{{"isFIFO", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "-1.5"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}), new String[][]{{"isFIFO", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "-1.5"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}), new String[][]{{"isFIFO", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ".1.5"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-1", "1073741823"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}), new String[][]{{"isFIFO", "", "7"}, {"getRealSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "EE1"}, false), new String[][]{{"getGroupId", "", "4"}, {"getLastModifiedDate", "", "1"}, {"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "FE"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}), new String[][]{{"getGroupId", "", "4"}, {"isBlockDevice", "", "1"}, {"parseTarHeader", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1.5d"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "'"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=64, getCount=64, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=100, getCount=100, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", ""}, false, 13, new String[][]{}), new String[][]{{"isDirectory", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "' before the '"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "2", "10"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "2", "10"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", ";"}, false, 0, null, 1), new String[][]{{"parseTarHeader", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-26", "1065353133"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-4611686017890516992"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "\n"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "\n"}}, 3), new String[][]{{"getGroupId", "", "6"}, {"getDirectoryEntries", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.tar.TarArchiveEntry;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "\n"}, false, 0, null, 3), new String[][]{{"getGroupId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "\n\n"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "\n\n"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "1"}}), new String[][]{{"getGroupId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "576460752303423489"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "576460752303423489"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"9223372036854775784"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "'"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"9223372036854775784"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "'"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"268435471"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-5"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-5"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "1.12345678"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "32", "-67108854"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "0", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "10"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "3", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"1073741829"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "'"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "0x123456789"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "0x123456789"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "0x123456789' before the '"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "3", "-30"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "3"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=64, getCount=64, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=100, getCount=100, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=256, getCount=256, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2, getCount=2, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", ""}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacterDevice=false, isDi...#260#-1988217491", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2130706388"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "3", "3"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-34078700", "0"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "0"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "0"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "-2147483648"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "1.12345678901234567"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=1.12345678901234567/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacte...#278#-1282547370", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=64, getCount=64, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=100, getCount=100, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-134217728"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1073479680"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "2130706432", "3"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2000, getCount=2000, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "0", "-2130706432"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "0", "-2130706432"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "0", "-2130706432"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"65499"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "2130706387", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "2130706387", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "'"}, false, 0, null, 2), new String[][]{{"getLinkName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-2130706448"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "2147483636", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-9223369562953613312"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "."}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.25"}}, 1), new String[][]{{"isCharacterDevice", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "a,bb-c"}, false, 0, null, 1), new String[][]{{"getGroupId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "1nvll"}, false, 0, null, 1), new String[][]{{"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-270582939619"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-545460846563"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-2"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-9"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-2139095040"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2130706432"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4, getCount=4, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "2130706432"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "ensqyXX '"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-31"}}, 3), new String[][]{{"setLinkName", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=?, getGroupId=0, getGroupName=, getLinkName=, getMode=16877, getName=ensqyXX '/, getRealSize=0, getSize=0, getUserId=0, getUserName=root, isBlockDevice=false, isCharacterDevice=fa...#268#-1280348199", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1073741819"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=64, getCount=64, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=128, getCount=128, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=200, getCount=200, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=24, getCount=24, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "' bytes for entry '"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 1), new String[][]{{"getMode", "", "4"}, {"isCharacterDevice", "", "5"}, {"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "' bytes lfor entry- '"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1), new String[][]{{"getMode", "", "4"}, {"isCharacterDevice", "", "5"}, {"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "' bytes lfor entry- '"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1), new String[][]{{"getMode", "", "4"}, {"isCharacterDevice", "", "5"}, {"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16, getCount=16, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
}
