package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "17"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=17, getCount=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-33"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:3>", "50000", "-62"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-3"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "99942"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "80"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-7"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775801, getCount=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372034707292162, getCount=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"100001"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-100001, getCount=-100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"100028"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100028, getCount=100028}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-12"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-12, getCount=-12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"99970"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-99970, getCount=-99970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-21"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-21, getCount=-21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-7"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1024"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1021, getCount=1021}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-50000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-50000, getCount=-50000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686018427387964"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387964, getCount=60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-4398046511106"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4398046511106, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"1027"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1027, getCount=1027}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "288230376151711743"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230375077969919, getCount=-1073741825}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"4244368"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4244368, getCount=4244368}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-19"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:5>", "-12", "41"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"4398046511104"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "1073741831"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4399120252935, getCount=1073741831}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:5>", "100036"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"1099511627784"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1099511627784, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2305840810190538401"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305840810190538401", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2305840810190538401, getCount=-100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2199023255556"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2199023255556, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"37"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=37, getCount=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"61"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=61, getCount=61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-8589934611"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8589934611", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8589934611, getCount=-19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:3>", "2", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-1099511627776"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-100000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1099511727776, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "41"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-62"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-62", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-62, getCount=-62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "268435457"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:7>", "2049", "33654374"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-199998"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-199998, getCount=-199998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-11, getCount=-11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "40", "2147467263"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "-1073741824"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "1075839017", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"33654322"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "49971"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33704293, getCount=33704293}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=27, getCount=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "4098"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "99941"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-199941, getCount=-199941}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "99989"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-99991, getCount=-99991}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "83617"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=83617, getCount=83617}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "4"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "49999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "16"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-48"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "8"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-40, getCount=-40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-18"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-18, getCount=-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-39"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99962, getCount=99962}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"4"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:9>", "536870914", "100000"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:5>", "10", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-8"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "99999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-99999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-99999, getCount=-99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"68719476740"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-13"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=68719476753, getCount=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "72057594037927943"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=72057594037927943, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"-12"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99988, getCount=99988}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-8"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-1610612736"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1610612744, getCount=-1610612744}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "268535456"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "3"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2199023255560"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2305843009213793971"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2305845208237049531, getCount=-100027}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"69"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-69, getCount=-69}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"2199023255554"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:5>", "1073743873", "268435409"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2199023255554, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "4398046511112"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4398046511112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4398046511112, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775784"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:3>", "0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775784, getCount=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "16"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:8>", "-8", "-33523302"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "99956"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99956", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99956, getCount=99956}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8, getCount=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"16827187"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16827187, getCount=16827187}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"65540"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=65540, getCount=65540}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"99999"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100037"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-100037, getCount=-100037}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"-536870913"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-31", "32809"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-536870913, getCount=-536870913}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "100001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8388614"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388614", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8388614, getCount=8388614}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"268435457"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-72057594037927935"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-72057593769492478, getCount=268435458}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "99942"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "43"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-45, getCount=-45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "2197094"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"62"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "549755814143"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-549755814205, getCount=-317}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"199884"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=199884, getCount=199884}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "4611686018427387903"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387900, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-140737488355327"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-17179869184"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-140754668224511, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100001"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "4611686018427487904"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427487904, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-100000, getCount=-100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-100000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100000, getCount=100000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "116384"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-116384", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-116384, getCount=-116384}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"99942"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2", "-2147483648"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99942, getCount=99942}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"1152921504606846979"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:3>", "2147483647", "8"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606846973, getCount=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "8", "2147483647"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "6", "2049"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "1073741844"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483648", "268435457"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:10>", "4", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "37"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=37, getCount=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-28"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=28, getCount=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "67108864"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=67108864, getCount=67108864}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-10, getCount=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4, getCount=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "24"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=24, getCount=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "2147483647", "1998"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "524288"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-524288, getCount=-524288}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "33"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-34, getCount=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"144115188075855877"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-144115188075855877, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "50000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-50000, getCount=-50000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "165537"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("165537", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=165537, getCount=165537}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", new String[]{"long"}, new String[]{"49"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=49, getCount=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "70368744177665"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-70368744177665", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-70368744177665, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2196641"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2196644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2196644, getCount=2196644}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"65539"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-65539, getCount=-65539}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"35184372088834"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-35184372088834, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"34"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-34, getCount=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-36028797018963970"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("36028797018963970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=36028797018963970, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854743008"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854743008, getCount=-32800}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "7"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-99999"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=99999, getCount=99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "33554439"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "1073741823", "536870916"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=33554439, getCount=33554439}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-35184372088831"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=35184372088831, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "52047"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("52047", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=52047, getCount=52047}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "18014398509481990"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18014398509481990", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=18014398509481990, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9, getCount=-9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "74"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "5"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:7>", "33654374", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-5, getCount=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-16"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-16, getCount=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "39"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=39, getCount=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "4611686018427387883"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387883", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387883, getCount=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2050"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2050", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2050, getCount=2050}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-19"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=19, getCount=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "137439003471"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-33"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-137439003504", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-137439003504, getCount=-50032}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "50"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-50, getCount=-50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "16"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16, getCount=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "134317705"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134317705", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-134317705, getCount=-134317705}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<sample:0>", "99942", "-1"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100001, getCount=100001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-6, getCount=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "100000"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "4611686018427387903"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387903, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "99996"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99996, getCount=99996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=38, getCount=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-99978"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=99978, getCount=99978}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "41"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=41, getCount=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", "byte[],int,int", "<null>", "0", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "144115188075955871"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-2199023255571"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("144117387099211442", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=144117387099211442, getCount=100018}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "23"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=23, getCount=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "805306374"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-805306374", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-805306374, getCount=-805306374}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "67158864"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2080324784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2080324784, getCount=-2080324784}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "132767"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=132767, getCount=132767}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "6"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4, getCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8, getCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "16777220"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16777220", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=16777220, getCount=16777220}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-137438753470"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-137438753470", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-137438753470, getCount=200002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775802", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775802, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=6, getCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "134217728"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("134217728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=134217728, getCount=134217728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3, getCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "1152921504606846982"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1152921504606846982, getCount=6}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-33454431"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-33454431", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-33454431, getCount=-33454431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "pushedBackBytes", "long", "70368744177666"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-70368744177666, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "4041"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4041", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4041, getCount=4041}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-4"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-12, getCount=-12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "3"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "int", "262096"}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262096", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=262096, getCount=262096}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "199998"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "count", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
