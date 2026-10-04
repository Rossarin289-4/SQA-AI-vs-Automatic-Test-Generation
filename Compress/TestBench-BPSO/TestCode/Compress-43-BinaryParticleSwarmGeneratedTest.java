package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "30"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"neLver"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaay"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=aaaaaaaaaaaaaaaaaaaaaaaaaaaaay, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "23"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=23, getCount=23, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "65594"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=null, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"ttrue"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=ttrue, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "0x12345678932768"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=0x12345678932768, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:2>", "0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"9"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"410"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "67108907", "202151586"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"Hello, Wold"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "17"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "65536"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65536, getCount=65536, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"101075735"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075735, getCount=101075735, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:7>", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "-32790"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "20"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"66"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:2>", "23", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=66, getCount=66, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "1.123456781e10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-524250"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "101075844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "Hemo, World"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "http;//example.com/a?c=c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:4>", ">a/b"}, false, 0, null, 1), new String[][]{{"setVersionRequired", "int", "4"}, {"getGeneralPurposeBit", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"/5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-58"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "No current] entry\u00e9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=No current] entry\u00e9, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"I"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=I, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"36"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "30"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=66, getCount=66, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=32768, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"68"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "69631"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=69631, getCount=69631, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775788"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-9223372036854775788, getCount=20, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "au b"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "i5.10"}}, 3), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("au b/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDa...#298#-475530515", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"202020510"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "0xFFEFFFFFI"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=202020510, getCount=202020510, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:0>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "32768"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1.1234567890123456"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "262140"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "\u00e8"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-50"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-50, getCount=-50, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "13", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "70000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"12:30:45f"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "-101010260", "19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=12:30:45f, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"111"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=111, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "32823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<null>", "2147483647", "50537896"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-17", "4"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"1073741824"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1073741824, getCount=1073741824, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "\t23456789012345678901234567890Hello, World"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("\t23456789012345678901234567890Hello, World/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[],...#376#1583493936", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=15, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"4"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"F"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "67455825", "2"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", ""}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "34"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=34, getCount=34, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "32726"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32726", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=32726, getCount=32726, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"43"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"255"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=255, getCount=255, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "Ui"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=Ui, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"513"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=513, getCount=513, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4111"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4111, getCount=4111, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-2, getCount=-2, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-16420"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-16420, getCount=-16420, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"101010256"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "101075812"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101010256, getCount=101010256, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1\r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1\r, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934588"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "truue0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8589934588, getCount=-4, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"65535"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "2251799813755273"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2251799813755273, getCount=70025, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.channels.ClosedChannelException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=32767, getCount=32767, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-51"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "543"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=543, getCount=543, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "134"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"No ctrrent entryUTF8"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "\""}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("\"/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDat...#294#1067063534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "202151575"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=202151575, getCount=202151575, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1u50"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1u50, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "00"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2146483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("00/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDa...#296#-320286234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=2146483648, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "131068"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=131068, getCount=131068, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"32768"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=32768, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101010306"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101010306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101010306, getCount=101010306, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "0", "-511"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-2147483648, getCount=-2147483648, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=34, getCount=34, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:9>", "a,b,cnot encodeable"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}), new String[][]{{"setExternalAttributes", "long", "6"}, {"getCrc", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}), new String[][]{{"setCentralDirectoryExtra", "byte[]", "2"}, {"getLastModifiedTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.file.attribute.FileTime", actual.getClass().getName());
  assertEquals("2026-10-03T13:35:15.397Z", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"2020-03-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=2020-03-30T25:61:61, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"33554441"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "32819"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=33554441, getCount=33554441, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-37"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "Ftr>e"}, false, 7, new String[][]{}), new String[][]{{"isUnixSymlink", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=12:30:45, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-100"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-100, getCount=-100, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"117853008"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=117853008, getCount=117853008, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "not encodeable"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=not encodeable, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=3, getCount=3, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"2.5e300"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "7", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "386288464"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=386288464, getCount=386288464, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " instead of abc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding= instead of abc, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "65535"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65535, getCount=65535, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "-202020512"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-202020512, getCount=-202020512, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70036"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=70036, getCount=70036, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "truei"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=truei, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"1.12345671L"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "6"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "117852953"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=117852953, getCount=117852953, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"65535"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:7>", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65535, getCount=65535, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1.12345678 "}, false, 6, new String[][]{}, 2), new String[][]{{"setSize", "long", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.12345678 / {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLo...#313#190139382", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "-4503582346491057"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-4503582346491057, getCount=101010255, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "-4194295"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "5;"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=5;, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"117853009"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "4", "101010256"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=117853009, getCount=117853009, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"84092328"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "6"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "81918"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-1073741824, getCount=-1073741824, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "139998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=139998, getCount=139998, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "294975", "202151582"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "271", "32790"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "Hello, Vorld"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"271"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-9, getCount=-9, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"12"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=12, getCount=12, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=123456789012345678901234567890, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:6>", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\u00e9, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "12345678901234567890123456789012:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=12345678901234567890123456789012:30:45, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"69982"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:4>", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-15"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-15, getCount=-15, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "235706014"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65536, getCount=65536, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"0.50x1F"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=0.50x1F, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "-32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-32767, getCount=-32767, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "32773"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=32773, getCount=32773, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "20,20-02-300T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-32"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("20,20-02-300T25:61:61/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttribute...#334#1548242798", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-32, getCount=-32, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-65518"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1L"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-2147450880"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"i"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "\r"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=i, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<empty>", "6", "1026"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1E-5"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "Hello, WorldHello, Worle"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "137438986241"}}), new String[][]{{"getPlatform", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=137438986241, getCount=32769, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-11, getCount=-11, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"268435968"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "58926504"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483621"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2147483621, getCount=2147483621, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "X020-02-300T25:61:61"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "8388606"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8388606", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=8388606, getCount=8388606, getEncoding=X020-02-300T25:61:61, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-65537"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "a,b,c-41"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "40"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=40, getCount=40, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"168119119"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:4>", "<a>4b<a>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=168119119, getCount=168119119, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "16384"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=16384, getCount=16384, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "14"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"22"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "0x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=0x123456789, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "a010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=a010, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "16777215"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16777215", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=16777215, getCount=16777215, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"2305843009314769745"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "56"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2305843009314769801, getCount=101075849, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"101010256"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101010256, getCount=101010256, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
