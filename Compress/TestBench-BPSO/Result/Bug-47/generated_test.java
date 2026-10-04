package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "63"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-63, getCount=-63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"32"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1610612736"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741878", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"60"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-60, getCount=-60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-134217636"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-18", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-134217636, getCount=-134217636}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-19", "32"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=32, getCount=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1125894538133505"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1125894538133506, getCount=-1073741822}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-33554432"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-33554432, getCount=-33554432}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-33554385"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33554385, getCount=33554385}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "88"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("88", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=88, getCount=88}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483661"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "4611686018427387903"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "38"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4831838148"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4831838147, getCount=-536870851}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"31"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-31, getCount=-31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "-2147475456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1099511627809"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "90", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1099511627809, getCount=-33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<null>", "23", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-268435456"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-18014398509481952"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=18014398509481952, getCount=-32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2251800350556205"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"302"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-20"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-20, getCount=-20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "23"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=23, getCount=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775781"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<empty>", "46", "14"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775781, getCount=-27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-9"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2130706431"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2130706432, getCount=2130706432}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4026531841"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4620693217682128895"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4620693217682128895, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"16"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"1073725494"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073725494, getCount=1073725494}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483648", "-13"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"23"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"46"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-31"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-77, getCount=-77}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "11"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=11, getCount=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "72057594037927958"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=72057594037927958, getCount=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"47"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"576460757135261696"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-576460757135261696, getCount=-536870912}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4831838166"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "144115192370823169"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-144115197202661335, getCount=-536870871}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "49"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=49, getCount=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "23"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "-63"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"21"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=21, getCount=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-28, getCount=-28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"8796093022253"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8796093022253, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"7"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "34", "-1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4831838208"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "46"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2093"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2093, getCount=2093}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "22"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "23"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-8388627"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8388627, getCount=-8388627}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"20"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-23"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-23, getCount=-23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-24"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-24, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967347"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967347, getCount=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"46"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"36028797018963984"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-36028797018963984, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-45"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<null>", "9", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "-2147483599"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-47"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"67108818"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-67108818, getCount=-67108818}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-129"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967297"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967168, getCount=-128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "9", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29, getCount=-29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-45, getCount=-45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "288230376151711761"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-288230376151711761, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "23"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-1152921504606846993"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "53"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606847046, getCount=70}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"16"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"34359738367"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-34359738367, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1125899906842626"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1125897759358979, getCount=2147483645}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "62"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1023"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("961", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=961, getCount=961}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "10", "38"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"8192"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "17179869228"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=17179869228, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "524303"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524303, getCount=524303}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2094"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2100, getCount=2100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "98", "41"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=22, getCount=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"1073741878"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073741878, getCount=1073741878}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-126"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-126, getCount=-126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-5"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "1073741878"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"23"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "2415919104"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2415919104, getCount=-1879048192}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "94"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "62"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "87"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "144115188075855886"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483634", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-144115190223339534, getCount=2147483634}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"44"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-44, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "1152921496016912382"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4294967295"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967295, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-15"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"22"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-4294967297"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4294967297, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1073741801"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1073741801, getCount=-1073741801}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "61"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775806"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"2684354559"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2684354559, getCount=-1610612737}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "29"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17, getCount=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147483633", "50"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-29"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-536870867"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-536870867, getCount=-536870867}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "19", "-2146435072"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775800"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775800, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "29", "-58"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-134217682"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-134217682", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-134217682, getCount=-134217682}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "34"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9680453632"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9680453632, getCount=1090519040}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "31"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"576460752304472093"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=576460752304472093, getCount=1048605}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294443009"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294443009", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294443009, getCount=-524287}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036317904896"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036317904896, getCount=536870912}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036850581504"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036850581504, getCount=4194304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"31"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=34, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"8"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"3758096384"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "1053"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3758097437, getCount=-536869859}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-31, getCount=-31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "48", "19"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967300, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-68719476678"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-68719476678, getCount=58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"9007199254740990"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9007199254740990, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"19327352832"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=19327352832, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "0"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "15"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-131073"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-131073", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-131073, getCount=-131073}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "4050"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4050", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4050, getCount=4050}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2", "69"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1073741825"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741825, getCount=1073741825}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4831838208"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4831838208", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4831838208, getCount=536870912}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", new String[]{"long"}, new String[]{"-8155"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8155, getCount=-8155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483647", "268435503"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "4294967295"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967280", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967280, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"13958643712"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "15"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1048577"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "17"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1048560, getCount=1048560}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "15"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "46"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-46", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-46, getCount=-46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-43"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-42, getCount=-42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", "byte[],int,int", "<null>", "-5", "2147483647"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-9223372036787666944"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036787666945, getCount=-67108863}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "262191"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-262191", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-262191, getCount=-262191}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "39", "-1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "31"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-1048577"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1048576", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1048576, getCount=-1048576}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "16"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "45"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=64, getCount=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "19"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "15", "37"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4113"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "16"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4129, getCount=4129}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "23"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483625, getCount=-2147483625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"16777239"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "-30", "76"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-8791261184000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8791261184000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8791261184000, getCount=-536870912}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"15"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "17"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=17, getCount=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "536870927", "1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "158"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("158", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=158, getCount=158}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4295000063"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4295000063, getCount=32767}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "31", "15"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "-4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "1152921504606847022"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606847022, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-2251799813685214"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2251799813685214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2251799813685214, getCount=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "29"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "47"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getNextZipEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "4294967295"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967295, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "skip", new String[]{"long"}, new String[]{"31"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "524317"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("524317", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524317, getCount=524317}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "9151314442816847871"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "262159"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262158", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9151314442817110030, getCount=262158}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "long", "30"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", "count", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
}
