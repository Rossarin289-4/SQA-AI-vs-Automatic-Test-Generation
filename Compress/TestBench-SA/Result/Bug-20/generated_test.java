package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29126"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-1342178343"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-233016"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "29127", "29128"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "1"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "-1", "-29127"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14577"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1342178343", "29126"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "1", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "29128", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29187"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14593"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14593"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29128"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29128, getCount=29128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "29128", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483620"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "29126", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29128"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:0>", "29127", "29128"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483642, getCount=-2147483642}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483640, getCount=-2147483640}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29176"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29173, getCount=-29173}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14593"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29176"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29176, getCount=-29176}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29213"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29210, getCount=-29210}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29127"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29127"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29127, getCount=-29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-27079"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-27079", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-27079, getCount=-27079}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29126"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147512776, getCount=-2147454520}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-8359482"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2139124168, getCount=2139124168}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "9223372036854775807"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-274877921537"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14593"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"139637972547809"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"139637972547809"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "2147483633"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-536870881", "0"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"4503599627399622"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4503599627399623, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29088"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854746719, getCount=29089}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-29088"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854746721, getCount=-29087}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-2147483591"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483591"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "2147483646"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483636"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483636, getCount=2147483636}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"536870911"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=536870911, getCount=536870911}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29126"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-29126"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147512773, getCount=2147454523}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-29126"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1073770949, getCount=-1073770949}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-29126"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1073770947, getCount=-1073770947}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29127"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-29126"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29126"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483646"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14593"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29128, getCount=29128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14593"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14593"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-274877921537"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "2147483646"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "29128", "29127"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29128"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"28"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-16748088"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-28, getCount=-28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"72"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-16748088"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-72, getCount=-72}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"144"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-16748088"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-144, getCount=-144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1152921504606846832"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-16748101"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606846832, getCount=-144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14593"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14593, getCount=-14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "14593"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-18014398509452856"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854761215, getCount=-14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29186"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-18014398509452856"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29186, getCount=-29186}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-29126", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"29126"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29126, getCount=29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372034707292161, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "29127"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "29127"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483642, getCount=-2147483642}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483640, getCount=-2147483640}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483646, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-274877921537"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-274877921537, getCount=-14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"274877921537"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=274877921537, getCount=14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"274877921560"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=274877921560, getCount=14616}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775803"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775803, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483646"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29126", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-58252"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-58252", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-58252, getCount=-58252}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"29126"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-274877921537"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223371761976854270, getCount=14594}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "0"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29128, getCount=29128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29134, getCount=29134}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "29126", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483646, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-2199023255553"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2199023255553", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2199023255553, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "28"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=28, getCount=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14465"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372034707292159, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483615", "58132"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<empty>", "0", "29127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-27083"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27083, getCount=27083}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-27083"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27084, getCount=27084}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-27037"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27037, getCount=27037}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-27154"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=27154, getCount=27154}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"277025390592"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-277025390592, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"-55"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<empty>", "0", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<empty>", "0", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483653, getCount=-2147483643}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<empty>", "0", "29128"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-274877921537"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483646"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372034707292163, getCount=-2147483645}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-2147483646"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372034707292162, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-274877921537"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=274877921537, getCount=14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"274877921537"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-274877921537, getCount=-14593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"274877921555"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-274877921555, getCount=-14611}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-2147483646"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483646, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483658"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372034707292150, getCount=-2147483638}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483666"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372034707292142, getCount=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483666"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686016279904238, getCount=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-2305843009213693952"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483666"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2305843007066210286, getCount=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-1342178343"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1342178343, getCount=-1342178343}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "29126"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "0"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29127, getCount=-29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-29127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-1342178343"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1342178343, getCount=-1342178343}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-1342178343"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-274877921537"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-276220099880, getCount=-1342192936}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"70368744184957"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"1"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"int"}, new String[]{"-14"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-14, getCount=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29169"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29169, getCount=-29169}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29169"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-1342178343"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1342207512, getCount=-1342207512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"29042"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-29041, getCount=-29041}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"15"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:5>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "29126"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29126", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29126, getCount=-29126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14593"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "29127"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "14593"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483647, getCount=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"65040838"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-37"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=65040838, getCount=65040838}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147483646"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483646, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147352575"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29127"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854743040"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854743046", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854743046, getCount=-32762}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854743040"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854743041", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854743041, getCount=-32767}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-56"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-56, getCount=-56}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"562947805938720"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "29127"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=29127, getCount=29127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"562947805938720"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "45511"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=45511, getCount=45511}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"35184372090937"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "44"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1073741823"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", "long", "-549755843069"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741823, getCount=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"-2147483674"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483674, getCount=2147483622}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483674"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483674, getCount=-2147483622}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483703"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483703, getCount=-2147483593}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", new String[]{"long"}, new String[]{"2147483711"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483711, getCount=-2147483585}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "-1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"1073741892"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-1025"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1025, getCount=-1025}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-274877921537"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-274877921536, getCount=-14592}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-274877921537"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-274877921534, getCount=-14590}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-576461027181344568"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("576461027181344568", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=576461027181344568, getCount=14136}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1152922054362689136"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152922054362689136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152922054362689136, getCount=28272}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-1152922054362689136"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "-274877921537"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152921779484767599", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152921779484767599, getCount=13679}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2147512783"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483646", "29128"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483639", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483639, getCount=2147483639}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "1"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "2"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "long", "4"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29120, getCount=-29120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-29123, getCount=-29123}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854746688, getCount=-29120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextCPIOEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "count", "int", "-29126"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29119", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854746689, getCount=-29119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "read", "byte[],int,int", "<sample:1>", "-4097", "-29122"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "536870913"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-536870913, getCount=-536870913}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "skip", new String[]{"long"}, new String[]{"14"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "536870865"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-536870865, getCount=-536870865}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "available", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775806, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "4611686018427387903"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387902", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387902, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "getNextEntry", ""}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "canReadEntryData", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}, {"org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream", "pushedBackBytes", "long", "4611686018427387903"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387900, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
