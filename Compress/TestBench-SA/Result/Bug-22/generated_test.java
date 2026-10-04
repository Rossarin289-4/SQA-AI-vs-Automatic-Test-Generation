package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"1073741823"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073741823, getCount=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483653, getCount=-2147483643}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "100000", "99999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"33554440"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33554440, getCount=33554440}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"33554440"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33454440, getCount=33454440}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"33554696"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33454696, getCount=33454696}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"67109392"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=67009392, getCount=67009392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"67109392"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=67209392, getCount=67209392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"281475043820048"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=281475044020048, getCount=67309392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"281509403558416"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=281509403758416, getCount=67309392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"281509403558416"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "100000", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=281509403658416, getCount=67209392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "10", "-1"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2", "-1"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-6, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775802, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-67109390, getCount=-67109390}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036787666418, getCount=-67109390}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775679"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775679, getCount=129}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"67109392"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-67109392, getCount=-67109392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"37"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-37, getCount=-37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2097115"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2097115, getCount=2097115}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "7", "7"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-1073741817", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "6", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"524287"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=524287, getCount=524287}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-134217726"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-134217726, getCount=-134217726}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100000"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100002, getCount=100002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "200000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=200002, getCount=200002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "140737488355330"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "200000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737488555330", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=140737488555330, getCount=200002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "200000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=200000, getCount=200000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "-1", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "-1", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-32"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=32, getCount=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-16"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "99999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "99999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "99999"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"7"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"4"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"16777220"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16777220, getCount=16777220}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483644"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483644, getCount=-2147483644}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1073741824, getCount=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1073741878"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1073741878", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1073741878, getCount=-1073741878}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"100000"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"6"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"26"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=26, getCount=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"7"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "-2147483648", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-4611686018427387903"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387903, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-137439053472"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=137439053472, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"274878106944"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-274878106944, getCount=-200000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"274878106894"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-274878106894, getCount=-199950}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"549756213788"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-549756213788, getCount=-399900}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1099512427576"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1099512427576, getCount=-799800}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "8", "-99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99998, getCount=99998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"8"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"23"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=23, getCount=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "6", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "3"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "2147483647"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "2147483647"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "2147483598"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-26"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=26, getCount=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "17592186044390"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17592186044390, getCount=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67109392", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-67109392, getCount=-67109392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9007199187631600"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67109392", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9007199187631600, getCount=-67109392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9007199187631615"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67109377", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9007199187631615, getCount=-67109377}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "7", "5"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"100000"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-99999", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"99939"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-100029", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99939, getCount=99939}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-36028797018864037"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-100029", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-36028797018864037, getCount=99931}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-36024398972352933"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-100029", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-36024398972352933, getCount=99931}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-100029", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "165536"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("165533", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=165533, getCount=165533}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "165536"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("165495", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=165495, getCount=165495}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "165536"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("165536", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=165536, getCount=165536}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483617"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483617", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483617, getCount=-2147483617}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483617"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483617", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483617, getCount=2147483617}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109396"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67109396", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-67109396, getCount=-67109396}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "99999", "200002"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100001, getCount=-100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-4398046411104"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4398046411104, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-4398046411040"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100064", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4398046411040, getCount=-100064}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-8796092822080"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-200128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8796092822080, getCount=-200128}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99990"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99990", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99990, getCount=99990}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-25769746066"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "100017"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-25769646049, getCount=157727}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-25769746061"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "100017"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-25769646044, getCount=157732}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"44"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"44"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"22"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=22, getCount=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "1", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-200000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=200000, getCount=200000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-2", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-4611686018427387904"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-549688704496"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("549688704497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=549688704497, getCount=-67109391}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<empty>", "10", "99999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "5"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:4>", "-65591", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-549755813883"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:4>", "-65591", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-549755813883, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100002"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100002, getCount=-100002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-231074"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-231074", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-231074, getCount=-231074}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-17180100258"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-231074", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-17180100258, getCount=-231074}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<empty>", "99999", "-2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "5"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "35184372088837"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("35184372088837", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=35184372088837, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-5"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "99950"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-99950", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-99950, getCount=-99950}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "67109392"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("67109392", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=67109392, getCount=67109392}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-1", "10"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-1", "10"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "99999", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-20"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-100020", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100020, getCount=-100020}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "99999", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "99999"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-288230380446679046"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288230380379569654", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=288230380379569654, getCount=-67109386}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-288230380446416902"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288230380379307510", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=288230380379307510, getCount=-67371530}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100008", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100008, getCount=100008}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99948"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99956", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99956, getCount=99956}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483640, getCount=-2147483640}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483641", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483655, getCount=-2147483641}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100043"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100043", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100043, getCount=100043}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "99999"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "5"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "67109392"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "10"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "99999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "99999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "10"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "99999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "10"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "99999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-7, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775762"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775762, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "100001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "4"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "70368744177745"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("81", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=70368744177745, getCount=81}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "140737488355490"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=140737488355490, getCount=162}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483628", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483628, getCount=-2147483628}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1073741824"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741804", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1073741804, getCount=-1073741804}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1073741824"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1073741824, getCount=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "7"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483646, getCount=-2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "10", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-6, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "10", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
}
