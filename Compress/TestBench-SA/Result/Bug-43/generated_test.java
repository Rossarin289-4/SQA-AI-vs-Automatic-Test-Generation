package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "65535"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "-2", "-14"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "36"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=36, getCount=36, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"101075824"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "8"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "65534"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075824, getCount=101075824, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2020-01-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=2020-01-01, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "[1,2]"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "512"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=[1,2], isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"43"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "UTF8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=43, getCount=43, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "a"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}}), new String[][]{{"setVersionMadeBy", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("4/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDat...#294#-1813207762", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:5>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "1.1234567"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "22"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", "org.apache.commons.compress.archivers.zip.Zip64Mode", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.12345678, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "--1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=--1, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "122"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=122, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "101010255"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101010255, getCount=101010255, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"-35032"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "512", "70000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{",s"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"010"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=010, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"010"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=010, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=0, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "3"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "4"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "69999", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "69999", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<null>", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "65534"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "65505"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "65505"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "98196"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-117852979"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "19"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "69999", "69999"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"117853008"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=117853008, getCount=117853008, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=I, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"II"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=II, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"IzI"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-2031616"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=IzI, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"II-1.5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-2031616"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=II-1.5, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-2031616"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"13"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "4294967294"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4294967294, getCount=-2, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "69999", "101010256"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "-14"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:3>", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"14"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=14, getCount=14, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "PU1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "15", "32767"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "4294967296"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "9", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "I"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:0>"}}, 2), new String[][]{{"getCentralDirectoryExtra", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "1073741823", "-65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "1073741823", "-65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "1073741823", "-65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<empty>", "13", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "43191"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=43191, getCount=43191, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "570", "33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "1.1234567"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"bad size for entry "}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "[1,2]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "-2", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<sample:6>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "2020-01-01"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "32768", "117853008"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "14", "23"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "18"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "101010255"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101010255, getCount=101010255, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "101010255"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101010255, getCount=101010255, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"17"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=17, getCount=17, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"70001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"70001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"101075793"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075793, getCount=101075793, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"101075793"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075793, getCount=101075793, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"101075825"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075825, getCount=101075825, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"18"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=18, getCount=18, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "17", "511"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"s"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=s, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"t"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=t, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-117852979", "4"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "70001"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", ": "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-117852979", "4"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "70001"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", ": "}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "-117852979"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-117852979", "4"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "2020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "65535"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:1>", "69999", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<null>", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=44, getCount=44, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=44, getCount=44, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "44"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=44, getCount=44, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"i"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"i"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=70001, getCount=70001, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"Tite"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-70001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-70001, getCount=-70001, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"Tiite1.1244567"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "2147483583"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483583, getCount=2147483583, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"32769"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=32769, getCount=32769, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"5"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=5, getCount=5, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "java.io.InputStream"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101075792"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=\n, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "l"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=l, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "6"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "65534"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "101075793"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101010257"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101010257, getCount=101010257, getEncoding=1e10, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "s"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("s/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDat...#294#990744590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1L, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "11"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=11, getCount=11, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "-117852979"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-117852979, getCount=-117852979, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"101075791"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"101010256"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=I, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<empty>", "32768", "117853009"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "69999", "101010256"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65535, getCount=65535, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "PT1H"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "http://eample.com/a?b\u00e9=c"}, false), new String[][]{{"getExternalAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"101075791"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075791, getCount=101075791, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"101075805"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075805, getCount=101075805, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2080374783"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "8"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "65534"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2080374783, getCount=2080374783, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "Title"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=Hello, World, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101075793"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101075793, getCount=101075793, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101075793"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=101075793, getCount=101075793, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2020-01-01"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "17", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=2020-01-01, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "2020-01-01"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "17", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=2020-01-01, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "69999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=69999, getCount=69999, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "34999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=34999, getCount=34999, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "43191"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=43191, getCount=43191, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "010"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"int"}, new String[]{"101075793"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "11"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=11, getCount=11, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=45, getCount=45, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", " "}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}), new String[][]{{"removeUnparseableExtraFieldData", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding= , isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<empty>", "32769", "65536"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", "java.lang.String", "not encodeable"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8, getCount=8, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "Title"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "117853007"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("Title {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFile...#299#-835684046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0xFFFFFFFF/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLoc...#312#2062865014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "4294967295"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=4294967295, getCount=-1, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "32769"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=32769, getCount=32769, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1.25"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "70000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("1.25/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFile...#300#1118347558", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=70000, getCount=70000, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:6>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "addRawArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry,java.io.InputStream", "<sample:5>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "513"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=513, getCount=513, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<null>", "65535", "65535"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=12:30:45, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=a,b,c, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<empty>", "14", "3"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "23", "32767"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.25"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.25, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101075793"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101075793, getCount=101075793, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"7"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=7, getCount=7, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"12"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=15, getCount=15, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseZip64", new String[]{"org.apache.commons.compress.archivers.zip.Zip64Mode"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "TITLE"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", "int", "-14"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"int"}, new String[]{"6"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=6, getCount=6, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "\t"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=\t, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "23"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=23, getCount=23, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "19"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=19, getCount=19, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"9"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", "int", "32768"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9, getCount=9, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "101010256"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101010256, getCount=101010256, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"65535"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1e10, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "12"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=12, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "101010256"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=101010256, getCount=101010256, getEncoding=0, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "65534"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65534, getCount=65534, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "nll"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("nll/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getDataOffset=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileD...#298#1659312366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "isSeekable", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "50537915"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=50537915, getCount=50537915, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:9>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "50537915"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=50537915, getCount=50537915, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.5d, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.5d"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.5d, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "c\"a\":}Title"}, false, 7, new String[][]{}, 1), new String[][]{{"getComment", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8, getCount=8, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "8"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8, getCount=8, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "long", "8"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8, getCount=8, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[],int,int", "<sample:0>", "101075793", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setComment", new String[]{"java.lang.String"}, new String[]{"12"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "int", "9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeZip64CentralDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-27"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "8"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-19, getCount=-19, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeOut", "byte[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.1234567890123456, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"38"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setUseLanguageEncodingFlag", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "/a/b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=/a/b, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"8"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setMethod", new String[]{"int"}, new String[]{"16"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeCentralDirectoryEnd", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "i"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setLevel", new String[]{"int"}, new String[]{"32769"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"a8ways"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=a8ways, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"8ways"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeDataDescriptor", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=8ways, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"a8waysnUull"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=a8waysnUull, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "deflate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "closeArchiveEntry", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.5d, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setCreateUnicodeExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setEncoding", "java.lang.String", "1.12345678"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "destroy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=1.12345678, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "setFallbackToUTF8", "boolean", "true"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-101010257", "101010256"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-101010257", "101010256"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "2147483647", "101010256"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=70000, getCount=70000, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-2147483647", "101010256"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=70000, getCount=70000, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70000"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=70000, getCount=70000, getEncoding=UTF8, isSeekable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "getEncoding", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "count", "int", "70000"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", "writeLocalFileHeader", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=70000, getCount=70000, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
