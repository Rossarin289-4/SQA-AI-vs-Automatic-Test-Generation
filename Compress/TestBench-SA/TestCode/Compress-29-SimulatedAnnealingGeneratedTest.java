package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "255"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "262144", "255"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-31"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<empty>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "0", "<sample:3>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<null>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "int", "9"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10, getCount=10, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:10>", "1.,,229900", "<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getSummary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:8>", "ba0C1.5e300", "<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1000", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1/,229027", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "ar", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:14>", "]. Occured at byte: ", "<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "29128", "10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "--1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "41UVnn3vo MLnwjc \\UR-AS---1s\r.6/10rj1s.2345678900>2345542c4967296", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}}), new String[][]{{"get", "java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"999"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:0>", "-13", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2080374784"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-1099511626753"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2080374784, getCount=-2080374784, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"cpio", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"cpio", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-2096662"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "65536", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-36028797019094982"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-404285"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<empty>", "-2147483647", "999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"a,b,c65435", "<sample:7>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "jar", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"a,b,c65335", "<sample:7>"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "jar", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"tar", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"+1", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "010", "<sample:3>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "tar", "<sample:3>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1000p", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "010", "<sample:3>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "tar", "<sample:3>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"07", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "cpio", "<sample:8>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "60011"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"120OB1.6f"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ar", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:18>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "07007702true", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"US-ASDII"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "arj", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:8>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "\n", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:5>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "<null>", "<null>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "1.S", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "7z", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "-62"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "4"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:12>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:12>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:6>", "TRAILER!!!", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-37"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:10>", "", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "938"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getSummary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1L", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "zip", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-37"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-37, getCount=-37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"zip", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", actual.getClass().getName());
  assertEquals("{getBytesWritten=0, getCount=0, getEncoding=UTF8, isSeekable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2097152", "29128"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "<a>b</a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"zip", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", " ", "<sample:1>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "\t\n", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", "java.lang.String,java.io.OutputStream", "jar", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "jar"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "byte[],int,int", "<sample:1>", "60013", "65534"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-36028797019094982"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:10>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "dump", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "pushedBackBytes", "long", "-70368744112095"}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextDumpEntry", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483646", "-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "2097152"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "1001"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1048575"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"65536"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "1048575"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4611686018427453439"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427453447, getCount=65543}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"a Fb"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"255"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-8796093021698"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2002"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "65512"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:7>", "\t\t", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1009"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:7>", "\t\n", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2096187"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"536870920"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-7"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:6>", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"14"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1024"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:5>", "jar", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1536"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "\t\n"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"3"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"65537"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\010", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1025"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1025"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "B", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=/a/b+}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=/a/b+}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "Unknown magic ["}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unknown magic [", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=Unknown magic [}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "TITLE"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=TITLE}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "Unknown magic ["}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ba/C", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ba/C", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ba/C", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "b", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:4>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "b", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:4>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "b", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:4>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "", "<sample:4>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "a b"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=a b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"4294967296"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967296, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"8589934591"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "1000"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "4"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=110, getCount=110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=110, getCount=110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"65535"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "262145"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-196610, getCount=-196610}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "8"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=11, getCount=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "8"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "60011", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "60011", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "60011", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "60011", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextDumpEntry", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-998, getCount=-998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-996, getCount=-996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "23456789012345668901234567890", "<sample:0>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "23456789012345668900234567890", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", new String[]{"long"}, new String[]{"2097150"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "2345:789012345668900234567890", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:9>", "1/,229027", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:5>", "29127"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "60012"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:14>", "1/,,229902", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "flush", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:10>", "1.,,229900", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "1/,+,2299 00", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "262143"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "1/,+,2299 00", "<null>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "2622143"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"999"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setBigNumberMode", "int", "2097150"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"256"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=256, getCount=256, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"999"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1000, getCount=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2097151"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "TRAILER!!!"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "2097151"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "TRAILER!!!"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<null>", "9", "60013"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<null>", "9", "60013"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<null>", "9", "60013"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=a b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"Mark is not supported.", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1024"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-2096662"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "a b", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "a\037a", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", "int", "29126"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "65534"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:7>", "\t", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-1001"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "65512"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:7>", "\t", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "1001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:10>", "\t\n", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-13"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:10>", "\010\n", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "dump"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "29128"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "4294967296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967296, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "truOX"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\010\n", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294967296"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", new String[]{"int"}, new String[]{"262145"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=262145, getCount=262145}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"1023"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "262145"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=263168, getCount=263168}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"int"}, new String[]{"1001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "I"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", "long", "999"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getMode=33188, getName=I, getRealSize=0, getSize=0, getUserId=0, getUserName=, isBlockDevice=false, is...#261#767216674", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "Title"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", actual.getClass().getName());
  assertEquals("{getAlignmentBoundary=4, getChksum=0, getDataPadCount=0, getDevice=!UnsupportedOperationException, getDeviceMaj=0, getDeviceMin=0, getFormat=1, getGID=0, getHeaderPadCount=0, getHeaderSize=110, getIno...#325#1883589213", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"-530430"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:3>", "2020-01-01", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "\t\013"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2", "257"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setLongFileMode", new String[]{"int"}, new String[]{"262144"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "\007\013", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:3>", "2020-01.01", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=64, getCount=64, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "close", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "65535", "3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "29128", "1025"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "8", "999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "i"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-31, getCount=-31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"60013"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1024"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=58989, getCount=58989}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"262145"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/b", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/b", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/b", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=/a/b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=/a/b+}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/ab+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ab+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=/ab+}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "/a/C", "<sample:2>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "/a/b+"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEntryEncoding=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "8589934590"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8589934590, getCount=-2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "canWriteEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"long"}, new String[]{"7"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "getEntryEncoding", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<empty>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.lang.String,java.io.InputStream", "ba/C", "<sample:0>"}, {"org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveInputStream", "java.io.InputStream", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "29127", "60011"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"1025"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1025, getCount=1025, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"257"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=257, getCount=257}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "29127", "3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=110, getCount=110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "write", "int", "1000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getBytesWritten", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=10240, getCount=10240, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getSummary", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=--1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "60012"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2097150"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "60011", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "count", "long", "65537"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("65537", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=65537, getCount=65537}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "getBytesWritten", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesWritten=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"65534"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-65534, getCount=-65534}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"7"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finish", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "createArchiveOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"0x123456789", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.archivers.ArchiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.ArchiveStreamFactory", "org.apache.commons.compress.archivers.ArchiveStreamFactory", "setEntryEncoding", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEntryEncoding=1.5d}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1048575", "29128"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:10>", "1.,,229900", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", new String[]{"long"}, new String[]{"8589934592"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "count", "int", "-13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=!NullPointerException, getCount=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<null>", "1/,,,229900", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "write", "int", "-2147483590"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"60013"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-60013, getCount=-60013}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "1/,+,2299 00", "<sample:1>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "1/,+,2299 00", "<sample:1>"}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:4>", "1/,,22[289\03700", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"2097152"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2097152, getCount=2097152}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:9>", "010", "<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:6>", "ello, World"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=1024, getCount=1024, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:9>", "01", "<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:6>", "1.12345678", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:6>", "ello, World"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=2048, getCount=2048, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:10>", "01", "<sample:5>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:12>", "", "<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:11>", "", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:11>", "", "<null>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:11>", "", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345678901234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:0>", "210", "<empty>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345568911234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesWritten=512, getCount=512, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:7>", "", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "123456789012345568911234567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "setAddPaxHeadersForNonAsciiNames", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry", "java.lang.String", "java.util.Map"}, new String[]{"<sample:11>", "3", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "finish", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "writePaxHeaders", "org.apache.commons.compress.archivers.tar.TarArchiveEntry,java.lang.String,java.util.Map", "<sample:12>", "12345678901234556891123567890", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"60012"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1024"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1024, getCount=1024}", SearchInputFactory_scaffolding.receiverState());
 }
}
