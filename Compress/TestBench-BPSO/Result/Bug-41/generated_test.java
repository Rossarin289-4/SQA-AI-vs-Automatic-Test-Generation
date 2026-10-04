package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-49"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"45"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"67108864"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "46"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17179869217"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17179869217, getCount=-33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-1073741824", "47"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"8"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"8796093022302"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223363240761753507, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-9222809086901354496"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9222809086901354496, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"22"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "31"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=53, getCount=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"116"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=116, getCount=116}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-130"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"16"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-17592186044371"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17592186044371, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-63"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-34"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-34, getCount=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "38"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=38, getCount=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "1048593"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "34"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-1073741824", "8222"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-67108911"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"34"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-29", "-46"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8589934645"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934645, getCount=-53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "90"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"47"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775806, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"536871010"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "76"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=536871086, getCount=536871086}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"49"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-48, getCount=-48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"30"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-30, getCount=-30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1073741777"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1073741777, getCount=-1073741777}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-73"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294969327"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294969254, getCount=1958}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "23"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "15"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "109"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=109, getCount=109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"15"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=21, getCount=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "31"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-17"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-17, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-62"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-62, getCount=-62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8589934594"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934594, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "262202"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "17", "-10"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "17"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"288230376151711614"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-288230376151711614, getCount=130}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"16"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-30"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-130"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-130, getCount=-130}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "45"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "7"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"31"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-31, getCount=-31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"47"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-130"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-129, getCount=-129}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"68"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4261412864"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4261412796, getCount=33554500}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"16777275"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16777275, getCount=16777275}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294969344"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-4004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4004, getCount=-4004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "211", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"103"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=103, getCount=103}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"131118"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=131126, getCount=131126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"4119"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4119, getCount=4119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-33554425"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-33554416"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-33554416, getCount=-33554416}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<null>", "47", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-7, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "34"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-34, getCount=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-25"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-43", "16390"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-24, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<null>", "7", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29, getCount=-29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"576460752303423534"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=576460752303423540, getCount=52}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387905, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483903"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483903, getCount=-2147483393}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483627"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483627, getCount=2147483627}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "44"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-524284"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-524284, getCount=-524284}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"103"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"15"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=32, getCount=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854773759"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2049", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854773759, getCount=-2049}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"34"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2097177"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2097177, getCount=2097177}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483596", "37"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967243"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967243, getCount=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-16777182"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16777182, getCount=-16777182}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967320"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967320", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967320, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"536870958"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-536870958, getCount=-536870958}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"90"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"30"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775751"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775798, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-27"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-27, getCount=-27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"38"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-2147483633"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483633, getCount=2147483633}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-15"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-46", "45"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1152921508901814271"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8070450527952961536, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "-2147483648"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775806"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967288"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967288, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2097358"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2097358", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2097358, getCount=2097358}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "140737488355388"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-140737488355388, getCount=-60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294969344"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"65551"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=65551, getCount=65551}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"31"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"72057594037927935"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4294967295"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=72057589742960640, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "34"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"4402341478425"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4402341478425, getCount=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-16"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "92"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483739, getCount=-2147483557}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "1023"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483619"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483619, getCount=-2147483619}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "29"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "17"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=17, getCount=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "94"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:5>", "-402653183", "67"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "31"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=33, getCount=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967380"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967380, getCount=-84}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"11"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4611686018427387903"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387903, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-59"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-59", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-59, getCount=-59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775806"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967297"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967297", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967297, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"17"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=17, getCount=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "-2147483648"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"8800387989504"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "92"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=92, getCount=92}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-80", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "288230376151711751"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=288230376151711751, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4194275"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4194275", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4194275, getCount=4194275}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-1", "47"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1125895611875270"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1125895611875270, getCount=-58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "30"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2147483647", "23"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"31"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"32770"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "2147483647", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "103"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-103", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-103, getCount=-103}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"16"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483648"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967296, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-146"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-146, getCount=-146}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"7"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967325"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967325, getCount=-29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "30"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"36028797018963998"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-6, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"16"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "24"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-24, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775806"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-4"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "30", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4294969344"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294969344, getCount=-2048}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"62"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=62, getCount=62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "30", "90"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "65566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65566", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-65566, getCount=-65566}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2146959360", "45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "8589934591"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "78"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-1", "16"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "30", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483616"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483616", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483616, getCount=2147483616}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "10"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "73"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("73", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=73, getCount=73}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"180"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-549755813858"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=180, getCount=180}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "32784", "47"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"140737488355343"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=140737488355343, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"35184372088862"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=35184372088862, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=63, getCount=63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-30", "-17"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-1", "72"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-33554431", "7"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2147484643"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147484646, getCount=-2147482650}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775806"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775806, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2147484672"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147484672", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147484672, getCount=-2147482624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "2147484672"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482624", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147484672, getCount=2147482624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "65536"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "122"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65414", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=65414, getCount=65414}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1048607"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1048607, getCount=-1048607}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-268435505"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-30064771072"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30333206577", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30333206577, getCount=268435505}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-1024"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967304"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967303, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "16777319"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777319", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16777319, getCount=-16777319}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147467264"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147467264", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147467264, getCount=-2147467264}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "277"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("277", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=277, getCount=277}", SearchInputFactory_scaffolding.receiverState());
 }
}
