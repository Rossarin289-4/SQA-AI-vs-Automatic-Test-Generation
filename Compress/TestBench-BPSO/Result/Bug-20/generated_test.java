package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-54", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "29126"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "53", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-2"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-4611686018427387904"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "106"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29083"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1026"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1026, getCount=-1026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"72057596185411584"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=72057596185411584, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"29129"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29130, getCount=29130}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"1048576"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1048576, getCount=1048576}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"536870914"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=536870914, getCount=536870914}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"14"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"144115188075855873"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-512"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-512, getCount=-512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "2147483647"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29141"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29141, getCount=-29141}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"140737488355329"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-140737488355328, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"536870911"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "263153"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=537134064, getCount=537134064}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-36028797018964008"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=36028797018964008, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29126"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "29094", "-22"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "14634"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "29128"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"40"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"524226"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=524226, getCount=524226}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"38"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=38, getCount=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-262128"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-262128, getCount=-262128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "53", "-262144"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "58256"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "2147483647", "134217728"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29126"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-7, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483649"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-29189"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "524288"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=553477, getCount=553477}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2684354560"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372033096679425, getCount=-536870913}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"14590"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=14590, getCount=14590}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2251799813714376"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2251799813714376, getCount=-29128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29127"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-40"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4294967294"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4294967294, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29063"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29063, getCount=-29063}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-268435455"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-268435455", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-268435455, getCount=-268435455}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-16", "-524288"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-134188601"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=134188601, getCount=134188601}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483585"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483585, getCount=2147483585}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "-536870910"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29126"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"268435457"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=268435463, getCount=268435463}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "524288"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483621"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483621, getCount=-2147483621}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "536870912"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=536870912, getCount=536870912}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "262128", "1"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "58316"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=58316, getCount=58316}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14578"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29127, getCount=-29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4194304"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4194303, getCount=-4194303}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-502"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-29126"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "58252"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14563"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14563", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14563, getCount=-14563}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483590"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "14564"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147469026, getCount=-2147469026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"16791779"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16791779, getCount=16791779}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483712"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483712, getCount=2147483584}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"537395200"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=537395200, getCount=537395200}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-28"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2305843009213693951"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-28, getCount=-28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"26"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=32, getCount=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"40"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-35"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-35, getCount=-35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29126"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "26", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "14563"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1048574"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1048574, getCount=-1048574}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14578"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-54"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-54, getCount=-54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14577"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14577", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14577, getCount=-14577}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "524288"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("524288", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524288, getCount=524288}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2101"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2101, getCount=2101}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483600", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483677"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483679, getCount=-2147483617}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2305843009213693951"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29156"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29156, getCount=-29156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "20", "262128"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"536870912"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1610612734"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1610612734, getCount=1610612734}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=20, getCount=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"53"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=53, getCount=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "535822338", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "14563", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"524288"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=524288, getCount=524288}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483739"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "58194"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29126", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29127"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147481607"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147481602, getCount=-2147481602}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29112"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29112, getCount=29112}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "40"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-40, getCount=-40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "44"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"29194"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29200, getCount=29200}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"80"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"536900008"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-524235"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524235", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-524235, getCount=-524235}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775749"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-524290"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-524290, getCount=-524290}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-101945"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("101945", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=101945, getCount=101945}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-2147483614"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483614", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483614, getCount=-2147483614}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-29127"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1048504"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1048504, getCount=1048504}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-70368744163050"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-70368744163050, getCount=14614}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "268402721"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<null>", "2147483646", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "3"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "29089", "268435457"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"262128"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854513680, getCount=262128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "36507222016"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-36507222016, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "254"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-254", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-254, getCount=-254}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741823, getCount=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29156"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29156, getCount=-29156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "268433409"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=268433409, getCount=268433409}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-58252"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-14563"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14563", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14563, getCount=-14563}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483646, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483646"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14578"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14577, getCount=-14577}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-14563"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:3>", "29066", "255"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14563, getCount=-14563}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-6442451008"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29100"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-4611686018427387904"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "-16777217"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "17594333528064"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=17594333528064, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14588"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147469060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147498236, getCount=2147469060}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "29126", "-2147483632"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29114"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29114, getCount=29114}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "36"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"29080"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29080, getCount=29080}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"1879048166"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1879048166, getCount=1879048166}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "262128"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "24"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-2251799813685249"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2251799813685273, getCount=-25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "58252"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=58252, getCount=58252}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-26"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-26, getCount=-26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-33"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"29098"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29098, getCount=29098}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:6>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "268435505"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=268435505, getCount=268435505}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"17592186044417"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775805, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-8191"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "40"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483674"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-29104"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29104", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29104, getCount=29104}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-14578"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=14578, getCount=14578}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2097232"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:2>", "-54", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2097232, getCount=-2097232}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "262155", "-2147483648"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "67108866"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "40"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775767, getCount=-41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "536870943"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=536870943, getCount=536870943}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"536870932"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483604"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29184"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "40"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29127"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29127, getCount=-29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"536870910"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29189"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29189, getCount=29189}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483647", "262128"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29127"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "58252"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=58252, getCount=58252}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "53", "2147483638"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29127"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "15"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=15, getCount=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "2147483606", "-2147483610"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "58256"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=58256, getCount=58256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29167"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29167", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29167, getCount=29167}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "0"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2305843009213752208"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2305843009213752208, getCount=-58256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"281477124194302"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-4294967292"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4294967292, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-2305838611167153722"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2305838611167153722, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29100"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29106, getCount=29106}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "562952100905023"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483585", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=562952100905023, getCount=-2147483585}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=109, getCount=109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "29145", "29128"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "40"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=40, getCount=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "522246", "262128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483602"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483602", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483602, getCount=-2147483602}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1099511642354"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1099511642354, getCount=14578}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29237"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29237", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29237, getCount=29237}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483667"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-281472829227010"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-281472829227010, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-16384"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16381, getCount=-16381}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29113"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29113", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29113, getCount=29113}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29156"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "14563"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14564", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=14564, getCount=14564}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "29049", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:3>", "-2147450879", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1024"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1024, getCount=-1024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775763"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483641, getCount=-2147483641}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2305772642616999936"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305772642616999936", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2305772642616999936, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "63"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-63, getCount=-63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"144115188075914128"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14573"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-14572, getCount=-14572}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-58"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=58, getCount=58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "36028797018993095"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("36028797018993095", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=36028797018993095, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "4294967326"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4294967326", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4294967326, getCount=-30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "140739635838956"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "268435478"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-140739367403478", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-140739367403478, getCount=-1879048150}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29107"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29107", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29107, getCount=29107}", SearchInputFactory_scaffolding.receiverState());
 }
}
