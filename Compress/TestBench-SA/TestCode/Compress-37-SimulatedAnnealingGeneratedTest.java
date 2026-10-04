package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775788"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 46, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-1125908496777274"}}, 3), new String[][]{{"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1125908496777274, getCount=-58, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-1000"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "272730423296"}}, 1), new String[][]{{"containsValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-272730423296, getCount=-2147483648, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"-2147483612"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483650, getCount=-2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1), new String[][]{{"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<empty>", "2147483646", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "-536869911"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536869911", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=536869911, getCount=536869911, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", "java.io.InputStream", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=22, getCount=22, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=24, getCount=24, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27, getCount=27, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=24, getCount=24, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=255, getCount=255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=255, getCount=255, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "258"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<empty>", "10", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=258, getCount=258, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1001, getCount=1001, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1001"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1002, getCount=1002, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223371968135299059"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"-843055154"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"256"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-2251808403619956"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1001, getCount=1001, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-500"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-500, getCount=-500, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1125900175278043"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-5066549580790739"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5066549580790739, getCount=1069, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1125900175278043"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-5066549580790739"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5066549580790732, getCount=1076, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "2147483648"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "1001"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1001, getCount=1001, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 29, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8589934593"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934593, getCount=-1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8589934565"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934565, getCount=27, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-8589934565"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<empty>", "256", "257"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8589934565, getCount=-27, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-17179869130"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<empty>", "256", "257"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=17179869130, getCount=-54, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<null>", "255", "999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "21"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=22, getCount=22, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "255"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=255, getCount=255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483633"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483633, getCount=2147483633, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1000"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1000, getCount=1000, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2000"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2000, getCount=2000, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483646"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-4294967292"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-1125908496777274"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1001"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-1", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1001"}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-1", "0"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "516"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "516"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "255"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=999, getCount=999, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"499"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=499, getCount=499, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"998"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=998, getCount=998, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"1996"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1996, getCount=1996, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"2029"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2029, getCount=2029, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"256"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "-4611686018427387904"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1001, getCount=1001, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:10>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:9>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "int", "-500"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-500, getCount=-500, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", actual.getClass().getName());
  assertEquals("{getDevMajor=0, getDevMinor=0, getDirectoryEntries=[], getGroupId=0, getGroupName=, getLinkName=, getLongGroupId=0, getLongUserId=0, getMode=33188, getName=0, getRealSize=0, getSize=0, getUserId=0, ge...#257#-1165663857", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}}), new String[][]{{"getUserId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "1000"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=257, getCount=257, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "1000"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=257, getCount=257, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=257, getCount=257, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-524"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1001"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1004, getCount=1004, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "255"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1003, getCount=1003, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1002, getCount=1002, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1009"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1011, getCount=1011, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "1009"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1009, getCount=1009, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"258"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-258, getCount=-258, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"289"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-289, getCount=-289, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-18014398509481984"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "255"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=18014398509481989, getCount=5, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-18014398509481984"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "255"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=18014398509481994, getCount=10, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "2147483646"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "255"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-255, getCount=-255, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "available", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-732"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-732, getCount=-732, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-732"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-476, getCount=-476, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-1464"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1208, getCount=-1208, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-1502"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1246, getCount=-1246, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-1492"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1236, getCount=-1236, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4294967292"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4294967036, getCount=260, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-8589934584"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "256"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934328, getCount=264, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-8589934584"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-18014398509481728"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-18014407099416312, getCount=264, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4294967292"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-18014398509481728"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-18014402804449020, getCount=260, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483654, getCount=-2147483642, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483640, getCount=-2147483640, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"41"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=49, getCount=49, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483655, getCount=-2147483641, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", new String[]{"int"}, new String[]{"1073741823"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073741831, getCount=1073741831, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCurrentEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextTarEntry", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("258", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=258, getCount=258, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("260", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=260, getCount=260, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=259, getCount=259, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "count", "long", "-257"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-255, getCount=-255, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"putAll", "java.util.Map", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"putAll", "java.util.Map", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"putAll", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "readRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getLongNameData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "markSupported", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "reset", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "4294967294"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1000, getCount=-1000, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "4294967294"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-998, getCount=-998, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "skip", "long", "4294967294"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "false"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setAtEOF", "boolean", "true"}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "setCurrentEntry", new String[]{"org.apache.commons.compress.archivers.tar.TarArchiveEntry"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "936", "1978"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1001, getCount=-1001, getRecordSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "pushedBackBytes", "long", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1073741823, getCount=-1073741823, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "parsePaxHeaders", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "255"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isEOFRecord", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "isAtEOF", ""}, {"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "mark", "int", "255"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0, getRecordSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getRecordSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.tar.TarArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1, getRecordSize=512}", SearchInputFactory_scaffolding.receiverState());
 }
}
