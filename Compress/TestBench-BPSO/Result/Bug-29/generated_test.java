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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getSummary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2048", "262145"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:6>", "Arhiver: "}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", "int", "-9"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "512"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", actual.getClass().getName());
  assertEquals("{getAlignmentBoundary=4, getChksum=0, getDataPadCount=0, getDevice=!UnsupportedOperationException, getDeviceMaj=0, getDeviceMin=0, getFormat=1, getGID=0, getHeaderPadCount=0, getHeaderSize=110, getIno...#329#-2060517378", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-9, getCount=-9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "0707012020-01-01", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"262143"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-262143, getCount=-262143, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "11"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "262145"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "jarArchive[r: "}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29126"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"070707", "<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"12:30:45", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9, getCount=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "-999", "29064"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "29128", "65534"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "255"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-2147491840"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "-2147483624"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-1834957"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", ".5", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"jar", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0, getEncoding=abc, isSeekable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=abc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4294967311"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=4294967823, getCount=527}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1.123745678"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "-262143", "512"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "9223372036854775806"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "/", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"8589950979"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "29175"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-547608330255"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29175, getCount=-29175, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"ITLE"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "zip", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", "long", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:5>", "120022", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147484160, getCount=-2147483136}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"123456789012345678901234567890", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ar", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "dump", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"j", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "arj", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "7z", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:1>", "--", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294967295"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "http://example.com/a?b=cTRAILER!!!", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"ar", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "1.123467", "<sample:7>"}}, 1), new String[][]{{"canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:8>", "29127", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"cpio", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "20o0-01-1"}}), new String[][]{{"closeArchiveEntry", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"cpio", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "TRAILER!!!4294967296", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", actual.getClass().getName());
  assertEquals("{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:9>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "4503599629467683"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4503599629467683, getCount=2097187}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"cpio", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}}), new String[][]{{"getCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"jar", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<null>", "162134", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:1>", "", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"zip", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"tar", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "1.12p45670x1F", "<sample:5>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}, 1), new String[][]{{"skip", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:0>", "1.12375677", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"<null>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"zip", "<sample:0>"}, false), new String[][]{{"readNBytes", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:2>", "US-ASCI6I+1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:6>", "65574", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1023"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"262095"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=262095, getCount=262095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "Mark is not supported."}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "29127"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"60011"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=60018, getCount=60018}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "pushedBackBytes", "long", "8589934545"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483654, getCount=-2147483642}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"2147483646"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29128"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "297"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-297, getCount=-297}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "131072"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", new String[]{"int"}, new String[]{"131067"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "576460752303423495"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "1024"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-262144"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-262144, getCount=-262144, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "57", "14563"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"220"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:6>", "29078", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=220, getCount=220}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-32768"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=32768, getCount=32768, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-3932160", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextDumpEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294967297"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=255, getCount=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1026"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "196617"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "Titme"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "true1.1234557"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"32763"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<null>", "2147483647", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2097104"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2048"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", new String[]{"int"}, new String[]{"135166"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "-2097150"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "3"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "262142"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"514"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-514, getCount=-514}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:2>", "7", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"54"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=54, getCount=54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", "int", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "29078"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"256"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-256, getCount=-256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1073741823"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073741824, getCount=1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "67305481", "512"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<sample:6>", "32799", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "134217731"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483646"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1073741853"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"9"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:5>", "6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"60026"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"/a/b1.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "Strream closed"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"65534"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:3>", "", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"I", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"null", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"262144"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "\u00e9]. Occured at byte: ", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=262144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"-65534"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-65534, getCount=-65534, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "292149", "14563"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"562949953450440"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=562949953450440, getCount=29128, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"65582"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"9223372036586340351"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=9223372036586340351, getCount=-268435457}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2097151", "3"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "29127"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"262095"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=262095, getCount=262095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"262195"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "60012"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "262138"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-262138, getCount=-262138, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"292149"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=292149, getCount=292149}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"3"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "pushedBackBytes", "long", "999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"1045"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1045, getCount=1045}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"255"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=255, getCount=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"8589934590"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8589934590, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-536841785"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-536841785, getCount=-536841785, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "9", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"262145"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=262145, getCount=262145}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"144115188075855873"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-144115188075855873, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"14563"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=14563, getCount=14563}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"1001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1001, getCount=1001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{" x", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"58252"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"\n", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934592"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "dump-0.0123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=8589934592, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"35651583"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=35651583, getCount=35651583}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"262144"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=262144, getCount=262144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "4611686009837453314"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"65"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=65, getCount=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "27"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27, getCount=27, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"576460752303424487"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-576460752303424487, getCount=-999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"512"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "60012"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60012", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=60012, getCount=60012, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"59988"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=59988, getCount=59988}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "http://example.com/a?b==c"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b==c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=http://example.com/a?b==c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "4294705151"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:5>", "65547", "32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"2147483588"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2147483588, getCount=2147483588}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"3"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "-262143", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", new String[]{"long"}, new String[]{"1048576"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2099199"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"-40"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=-40, getCount=-40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"262095"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=262095, getCount=262095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"-65537"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"60013"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=60020, getCount=60020}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"Hello, Wnrld"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=Hello, Wnrld}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "9042383626829832"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9042383626829832", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9042383626829832, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:6>", "0x1F"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "60013"}}), new String[][]{{"getRemoteDeviceMaj", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"549755813952"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "2097216"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=549753716736, getCount=-2097152, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"1016"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1016, getCount=1016, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"070712020-01-01"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=070712020-01-01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036720558080"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-65534, getCount=-65534, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}), new String[][]{{"containsKey", "java.lang.Object", "5"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", new String[]{"int"}, new String[]{"-69206015"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "4353", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextDumpEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "268495467"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268495467", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-268495467, getCount=-268495467, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:7>", "1.12345670x1F", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "byte[],int,int", "<null>", "2147483647", "65534"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"4"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=516, getCount=516}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"3"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-57"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-57, getCount=-57}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"long"}, new String[]{"999"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "131063"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=999, getCount=999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "268435711", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4406636445696"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4406636445697, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"46"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-43, getCount=-43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:5>", "", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "123456789012345678901234567890"}, false, 7, new String[][]{}), new String[][]{{"getFormat", "", "7"}, {"getHeaderSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2058", "1001"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"65519"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "cpio070701 not found.", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getSummary", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", "byte[],int,int", "<sample:6>", "65536", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"01m"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=01m}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"3"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"7"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "120047", "292149"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
}
