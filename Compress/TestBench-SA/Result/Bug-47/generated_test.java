package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1152921504607371310"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1152921504607371293, getCount=524317}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372028264841214"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"47"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036852678654"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "138", "-2139095040"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=41, getCount=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4194305"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4194305, getCount=-4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-8589934578"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4194305"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294967296"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-137443147777"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-137443147777, getCount=-4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4294967296"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775786"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1073741823"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741823, getCount=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1073741823"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "17", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "17", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "17", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "17", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775764"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775764, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686018427387392"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "30"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387422, getCount=-482}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-44, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"90"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-89, getCount=-89}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"30"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-2305843009213693952"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2305843009213693952, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775806, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "18"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "39"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775776"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775754"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4611826755915751590"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"35184371957844"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-35184371957844, getCount=130988}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"70368744046676"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-70368744046676, getCount=130988}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "15", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "30", "30"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686016279904314"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686016279904314, getCount=-2147483590}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2305843008139952157"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2305843008139952157, getCount=-1073741795}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2305843008139952157"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2305843008139952204, getCount=-1073741748}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "8239"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "8239"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4611686018427387895"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387903, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"46"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-62, getCount=-62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-46"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1152921504606847022"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606847006, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1152921504607371310"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1152921504607371294, getCount=524318}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"47"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"51"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=51, getCount=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-1152921504607371310"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "29", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=37, getCount=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=36, getCount=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=41, getCount=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=18, getCount=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=20, getCount=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=23, getCount=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=37, getCount=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"46"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372028264841214"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-2"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"57"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372028264841214"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"57"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"17"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"17"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4194305"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4194305, getCount=4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-1152921504607371310"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152921504607371309", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504607371309, getCount=-524333}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-1152921504607371310"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1152921504607371310", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504607371310, getCount=-524334}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "31", "17"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "8"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-2"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"16"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775793, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "45"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "46"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036852678654"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036852678651, getCount=2097157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036852678654"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036852678653, getCount=2097155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "18"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967295"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967295, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "46", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "17", "45"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "8239"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2", "16"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372028264841214"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372028264841214"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "45"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "17"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "86"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"29"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-46"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-46, getCount=-46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"92"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=92, getCount=92}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"153"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=153, getCount=153}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036852678654"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097154", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036852678654, getCount=2097154}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "15"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372028264841214"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "10", "47"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "10", "47"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "10", "47"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "33554442", "6"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "7"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1152921504607371310"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152921504607371310, getCount=524334}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"46"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29, getCount=-29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "14"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "22", "22"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"34"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-7"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-4611686018427387875"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686016279904234, getCount=2147483626}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-3"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-4611686018427387875"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686016279904230, getCount=2147483622}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"4294967297"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967297, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"4294967315"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967315, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"4294967350"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967350, getCount=54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4611686018427387931"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "4294967295"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387931, getCount=-27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "4294967295"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "10"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "45"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-8388598"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8388598, getCount=-8388598}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2031692", "-65530"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967296"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967296, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2146434559"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "140737488355357"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737488355357", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=140737488355357, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "25", "34"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "47", "14"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "47"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775801, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775800", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775800, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "46"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=53, getCount=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "16", "-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "29"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29, getCount=-29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"32810"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-2", "17"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "14"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "16"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627792"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627798", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627798, getCount=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627792"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627795", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627795, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627847", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627847, getCount=71}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627852", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627852, getCount=76}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627859", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627859, getCount=83}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627851", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627851, getCount=75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1099511627844"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099511627856", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511627856, getCount=80}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372028264841214"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372028264841214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4611686014132420607"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686014132420607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686014132420607, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "46"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-20", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-31", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "53"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "-1"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "0"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-42, getCount=-42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-13, getCount=-13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4294967297"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4294967295, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1073741824"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1073741824, getCount=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1073741824"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372035781033983, getCount=-1073741825}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "15"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-44"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-44, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "30"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967296"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967296, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372028264841214"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372028264841214, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "576460752303423473"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-576460752303423473, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1152921504606846946"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606846946, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967295"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967295, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1152921504606846988"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606846988, getCount=-12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "576460752303423494"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-576460752303423494, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "576460752034988038"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435450", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-576460752034988038, getCount=268435450}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "576460752034988038"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435435", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-576460752034988053, getCount=268435435}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "4294967295"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "18"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-18"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=26, getCount=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-1152921504607371310"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504607371310, getCount=-524334}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967297"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967297, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "31", "-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-1152921504607371310"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504607371310, getCount=-524334}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"47"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"30"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"46"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372028264841214"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372028264841214, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-7, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"15"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775806"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775806, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"144115190223339753"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-32"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775806"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"562958543355967"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "16"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=562958543355967, getCount=63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"562958543355931"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "16"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=562958543355931, getCount=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "30"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=38, getCount=38}", SearchInputFactory_scaffolding.receiverState());
 }
}
