package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "216"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "769"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-4593671619917905920"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "9223372036854775806"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775806, getCount=-2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "500", "-1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"6098"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483646"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147489744, getCount=-2147477552, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "-21"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"955"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"463"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "193"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"33020"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33020, getCount=33020, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "127"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "4294967296"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4294967295, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"63"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=63, getCount=63, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775790"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775790, getCount=18, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"33023"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "562949953421375"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=562949953421376, getCount=64, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"128"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=128, getCount=128, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"134218729"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"536870911"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=536870911, getCount=536870911, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483596", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1040"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1040, getCount=1040, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"128"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "146"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=128, getCount=128, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-9223354444668731392"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223354444668731392, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "132073"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=999, getCount=999, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"-8"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4398046509977"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4398046509972, getCount=1132, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "2251799813685503"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 60, 98]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2002"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2002, getCount=-2002, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-31"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-31, getCount=-31, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1021"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"-500"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "0", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"2251799822074111"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2251799822074111, getCount=8388863, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"20"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=20, getCount=20, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"-262113"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-262113, getCount=-262113, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "2147483591"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=25, getCount=25, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"450"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1998"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1998, getCount=1998, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "484"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"511"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=511, getCount=511, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"769"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=769, getCount=769, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "33025"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33026, getCount=33026, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1279"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1279, getCount=1279, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"2147483646"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=999, getCount=999, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "997"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=998, getCount=998, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"2251799813685503"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-9223372036854775808"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2251799813685503, getCount=255, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"-31"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"257"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-257, getCount=-257, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"514"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=514, getCount=514, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775805, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "510"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=511, getCount=511, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"entrySet", "", "3"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"33025"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-9223372036854775773"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775773, getCount=35, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-2147483646"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "525"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483643, getCount=-2147483643, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2251799813685503"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2251799813685503, getCount=255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1001", "484"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "255"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483650, getCount=-2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:11>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-2147483589"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "236"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483589, getCount=-2147483589, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "384", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "256"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=256, getCount=256, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-236"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=236, getCount=236, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"128"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-128, getCount=-128, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"999"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "562949953421056"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-562949953422055, getCount=-743, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-9223363240761753600"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223363240761753600, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}), new String[][]{{"values", "", "0"}, {"removeAll", "java.util.Collection", "3"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"257"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "255"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-255, getCount=-255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 4, new String[][]{}), new String[][]{{"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483671"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483629"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967300, getCount=4, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "999"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-256"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-255, getCount=-255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "2", "195"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"262628"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=262628, getCount=262628, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483609"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483609, getCount=2147483609, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:3>", "2002", "-255"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}), new String[][]{{"get", "java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"entrySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=, getRealSize=0, getSize=0, getUserId=0, get...#256#304886247", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "4095"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4096, getCount=4096, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "2147483611"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "511"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=511, getCount=511, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-256"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-256, getCount=-256, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483624"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483624, getCount=2147483624, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-1000"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"451"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=451, getCount=451, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "31"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "255"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=258, getCount=258, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"1001"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1001, getCount=1001, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-72"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-72, getCount=-72, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false), new String[][]{{"putAll", "java.util.Map", "2"}, {"containsValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483613"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483614, getCount=2147483614, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "257"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=258, getCount=258, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "769"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=769, getCount=769, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
}
