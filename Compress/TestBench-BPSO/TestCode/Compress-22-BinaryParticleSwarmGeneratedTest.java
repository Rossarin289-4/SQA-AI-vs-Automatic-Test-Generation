package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483653, getCount=-2147483643}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775799, getCount=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2305843009213694981"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2305843009213694981, getCount=-1029}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1019"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1020, getCount=1020}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-8184"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8184, getCount=8184}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"536870656"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-536870656, getCount=-536870656}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "6", "-5"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2305843009213693956"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2305843009213593955, getCount=99997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-14"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=14, getCount=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-8935141660703064063"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8935141660703064060, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "1", "4"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:6>", "-2147483648", "100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-12"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-11, getCount=-11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:3>", "100001", "-2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"72057594037927912"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=72057594037927912, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-59"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-59, getCount=-59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-65", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-65, getCount=-65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"576460752303423487"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=576460752303423487, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "137438953419"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-53", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=137438953419, getCount=-53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "44"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-4101"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4090, getCount=-4090}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-4194308"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4194308, getCount=-4194308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:9>", "2", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "-44", "12"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"288230376151811747"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151811747, getCount=100003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "199998", "40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-19, getCount=-19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"12"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "15"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:4>", "-2147483648", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "34359838334"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-34359838334, getCount=-99966}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"100034"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100034, getCount=100034}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "8796093253281"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "2147483647", "-131036"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8796093253281", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8796093253281, getCount=-231073}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "-8187", "50062"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-127"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-127, getCount=-127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-8"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "4"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "14"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"14"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=14, getCount=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "7"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-62"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-62, getCount=-62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8589934593"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10737418240, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-2041"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2041", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2041, getCount=2041}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-38", "44"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "399996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("399996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=399996, getCount=399996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-7"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "51"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"25"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-25, getCount=-25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372034707292160, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=29, getCount=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "5", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483647", "8"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"8"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"29"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "144115188075855876"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=144115188075855905, getCount=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-5"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"7"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-7, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=5, getCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "2", "100000"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "39"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=39, getCount=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=13, getCount=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "7", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-30"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-25, getCount=-25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2136"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2137, getCount=2137}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "200116"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-200110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-200110, getCount=-200110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1073741831"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741831", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741831, getCount=1073741831}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-8796093022212"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8796093022212", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8796093022212, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:5>", "400004", "99999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"44"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=45, getCount=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"4"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "40"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=44, getCount=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "99999"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-99999, getCount=-99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"1048577"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1048577, getCount=1048577}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "2", "99988"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-288230376151711700"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=288230376151711700, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=12, getCount=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2305843009213693951"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2305843009213693951, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-35184372088800"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-35184372088800, getCount=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=30, getCount=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-32, getCount=-32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "2"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "14"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=14, getCount=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "50000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-50000, getCount=-50000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "262"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=262, getCount=262}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"10"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775800, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"199998"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "6"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-200004, getCount=-200004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2449958197289549828"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2449958197289549828, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "27"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=27, getCount=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775772"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775772, getCount=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "84"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=84, getCount=84}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-15"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-15, getCount=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-72057594037927936"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9151314442816847871, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "99970"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-131067"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-131067", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-131067, getCount=-131067}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "200000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=200000, getCount=200000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"100000"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1", "66"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1045"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "50000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("49994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=49994, getCount=49994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8", "2147483647"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "72057594038027928"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=72057594038027928, getCount=99992}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99998, getCount=99998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-100001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100001, getCount=-100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775784"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775784, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "23"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=23, getCount=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483645"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483645, getCount=2147483645}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036787666997"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67108811", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036787666997, getCount=67108811}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854251520"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854251520", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854251520, getCount=524288}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036317904895"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036317904895, getCount=-536870913}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"72057594037927938"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-72057594037927938, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "49999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("49999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=49999, getCount=49999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "12", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2305843009213693953"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2305843009213693953, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "99999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4563402760"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775551"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372032291373305, getCount=-268435207}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-512"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-512, getCount=-512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "199998"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("199998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=199998, getCount=199998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "209"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=209, getCount=209}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "0"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "259"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=259, getCount=259}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-6, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"55"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-55, getCount=-55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "10", "-4"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100056"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-100056", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100056, getCount=-100056}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036821221375"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036821221375", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036821221375, getCount=33554433}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "6", "49944"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "536870920"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870920", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=536870920, getCount=536870920}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"6"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775776"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775770, getCount=-38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"34"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-34, getCount=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-65530"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=65530, getCount=65530}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-26"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=26, getCount=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-3, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-31073"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31073", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=31073, getCount=31073}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"99969"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-99969, getCount=-99969}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-13, getCount=-13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2080374784"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2080374784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2080374784, getCount=-2080374784}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2199023255560"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2199023255560, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "50"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=50, getCount=50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-121"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-121, getCount=-121}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "14"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=14, getCount=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2199023255556"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2199023255554, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
