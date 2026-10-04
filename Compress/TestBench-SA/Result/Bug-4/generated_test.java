package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "8", "511"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "16"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"101010256"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1", "16"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1e10"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=1e10, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-16777217"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "134695760", "-2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "256"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " bytes)"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= bytes), isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-1"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:2>", "<sample:6>"}}, 3), new String[][]{{"getDeleted", "", "7"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "TRAILER!!!"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=TRAILER!!!, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "42", "463"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<empty>", "50505127", "8065"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "request to write '"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=request to write ', isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "2", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "b"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "50505127"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "0", "-16777217"}}, 3), new String[][]{{"getModTime", "", "1"}, {"setHours", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 04:00:00 PST 1969 {getDate=31, getDay=3, getHours=4, getMinutes=0, getMonth=11, getSeconds=0, getTime=-43200000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "4"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "3", "8193"}}, 1), new String[][]{{"setUID", "long", "6"}, {"getMode", "", "3"}, {"getRemoteDevice", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "`e22' s !too ong ( > "}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-1073741824"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2), new String[][]{{"getExtraFields", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "8", "511"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "8191"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "16"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "070701"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "9"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "070702"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "9"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "070702"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "101010257"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "101010257"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "9", "16"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"--11.1345678901235561L"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "-1073610752"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "-1073610752"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"-10"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"48"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"' is too long ( > "}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "20"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "15", "8191"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:2>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.changes.ChangeSetResults", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-513"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-513"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= , isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"8203"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "8193", "8192"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "Title"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "TitlRentry '"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=TitlRentry ', isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"././@"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-18"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:0>", "-1", "134695760"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-134695761", "-2"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:2>", "254", "8"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "1.1234567890123456"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "1.1234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"254"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "17", "512"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "-0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=-0.0, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2049"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "1", "2049"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2049"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "1", "2049"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<empty>", "16", "511"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "070701"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-65471"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2", "16"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "9", "16"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"134695760"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<null>", "4", "8"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "{\"a\":1}"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding={\"a\":1}, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"8191"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "101010257"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "<null>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "Title"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2048"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", actual.getClass().getName());
  assertEquals("{getAlignmentBoundary=4, getChksum=0, getDataPadCount=0, getDevice=!UnsupportedOperationException, getDeviceMaj=0, getDeviceMin=0, getFormat=1, getGID=0, getHeaderPadCount=0, getHeaderSize=110, getIno...#325#1806688415", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "255", "4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<null>", "8", "134695760"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "' is too long ( > "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=0, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"070702"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=070702, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"70702"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=70702, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=1.5f, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1.Ef"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=1.Ef, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "request to write '"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= , isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"101010255"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"' is too long ( > "}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=a,b,c, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "a,,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=a,,c, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2049", "101010256"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "1.5d"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"29128"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<empty>", "29127", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:2>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:2>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.changes.ChangeSetResults", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:2>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}), new String[][]{{"getAddedFromStream", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "\u00e9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:0>", "101010257", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "5."}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "5."}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}), new String[][]{{"getUID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0xFFFFFFFF {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#318#509515648", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "123456789012345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "16"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=123456789012345678901234567890, getSize=0, getUserId=0, getUserName=root, isDirectory=false, isGNULongNameEnt...#209#1314016558", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "TitlRentry '"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=TitlRentry ', isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "-2", "2048"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"3002E2e3467"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", ".5"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=.5, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "134695761", "-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "134695761", "12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "1.25"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.25 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#306#511199168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=-0.0, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " bytes)"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= bytes), isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:0>", "10", "-36"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=2, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "entry '"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=entry ', isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", ".5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=.5, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "B5"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "request to write '"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=B5, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "request to write '"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= , isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "Stream closed"}, false), new String[][]{{"getUserId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "PT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:8>", "request to write '"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "29127"}}), new String[][]{{"getMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "request to write '"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "29127"}}, 3), new String[][]{{"getMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "request to write '"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "29127"}}, 3), new String[][]{{"getMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<null>", "7", "134695731"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "29127"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "10", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "5", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "3", "4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "CRC Error"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "512", "513"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "229127"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-2147483647"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<null>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<null>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:7>"}}, 2), new String[][]{{"getAddedFromStream", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.changes.ChangeSetResults", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:9>"}}), new String[][]{{"getAddedFromStream", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:9>"}}), new String[][]{{"getAddedFromStream", "", "5"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:6>", "<sample:0>"}}), new String[][]{{"getAddedFromStream", "", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"' before the '"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=12:30:45, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<null>", "<sample:1>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:7>", "<sample:0>"}}, 2), new String[][]{{"getAddedFromStream", "", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"getAddedFromStream", "", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<null>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:0>", "<sample:4>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:6>", "<sample:5>"}}, 3), new String[][]{{"getAddedFromChangeSet", "", "5"}, {"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:0>", "<sample:4>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:5>", "<sample:5>"}}, 3), new String[][]{{"getAddedFromChangeSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("\u00e9 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#300#-1364675168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:6>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"getAddedFromStream", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:6>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:1>", "<null>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"getDeleted", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:1>", "<null>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"getDeleted", "", "3"}, {"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:7>", "<sample:0>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:1>", "<sample:7>"}}, 1), new String[][]{{"getDeleted", "", "3"}, {"remove", "java.lang.Object", "1"}, {"trimToSize", "", "0"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"getDeleted", "", "1"}, {"trimToSize", "", "7"}, {"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:10>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:6>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.changes.ChangeSetPerformer", "org.apache.commons.compress.changes.ChangeSetPerformer", "perform", new String[]{"org.apache.commons.compress.archivers.ArchiveInputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:3>", "<sample:3>"}, {"org.apache.commons.compress.changes.ChangeSetPerformer", "perform", "org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "[1,2]"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=[1,2], isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "fgi)e!name '+1+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false), new String[][]{{"getInternalAttributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "070701"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=070701, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=2147483648, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2147483E48"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483E48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=2147483E48, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "CRC Error"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("CRC Error {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#304#592736189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "CRC Error"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 3), new String[][]{{"getPlatform", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "CRC Error"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}), new String[][]{{"getPlatform", "", "3"}, {"getExtra", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "a,b,c"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a,b,c {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#308#-857308586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "Unknown format: "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=Unknown format: , isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " bytes)"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding= bytes), isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "1.1234567"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.1234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#316#-1366564220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "1"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "9", "12"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 50, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 59, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"11"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "17"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "8", "8192"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"512"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1-5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.5e300"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "15"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "1.5e300"}, false, 0, null, 3), new String[][]{{"getMode", "", "1"}, {"getMode", "", "2"}, {"setName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=a, getSize=0, getUserId=0, getUserName=root, isDirectory=false, isGNULongNameEntry=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8191", "3"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "entry '"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "' before the '"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}), new String[][]{{"getFile", "", "7"}, {"getParent", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
}
