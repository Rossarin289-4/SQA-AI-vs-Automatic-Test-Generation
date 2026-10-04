package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:4>", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"z", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<null>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "156abc", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"pack200", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "bzip2", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"lzmaMark is not supported.", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "-1", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "gz", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"snappy-raw", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", " not fo", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream", actual.getClass().getName());
  assertEquals("{getBytesRead=1, getCount=1, getSize=97}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"snappy-framed", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "1\t.5", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "xz", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "lzma", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0xFFFFFFFF2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"bzip2", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"gz", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:6>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"pack200", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "deflate", "<sample:0>"}}), new String[][]{{"write", "byte[]", "6"}, {"finish", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"xz", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"deflate", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:1>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "nul81E-5", "<null>"}}), new String[][]{{"available", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "50"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"0", "<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"134217728"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=134217728, getCount=134217728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"65589"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "155"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=65589, getCount=65589}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-576460752303423270"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=576460752303423270, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-17592186044635"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=17592186044635, getCount=219}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "56"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "144115188075839490"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=144115188075839490, getCount=-16382}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"8589934594"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-8589934594, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"50"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "524294"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=524344, getCount=524344}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"271"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-271, getCount=-271}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{".5", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"54"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "4194492"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4194492, getCount=-4194492}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"84", "<empty>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"170"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-170, getCount=-170}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"F\t", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"131192"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-134217290"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-131192, getCount=-131192}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"a,b,c", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", ".252147483648", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483552, getCount=2147483552}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-31"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=31, getCount=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"153"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=153, getCount=153}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"219"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-219"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "112", "47"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-43"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=219, getCount=219}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"16624"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-436"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "29"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"1", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"2147483958"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483958, getCount=2147483338}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"94"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "346"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("346", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=346, getCount=346}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"155"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-119"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483766, getCount=-2147483530}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"145"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<empty>", "1", "155"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=145, getCount=145}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "155", "-156"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-32739"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"47"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=47, getCount=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-16776778"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "78"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"872"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.\n5f", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"151"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"-62"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-8191"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8129, getCount=8129}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "219"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=219, getCount=219}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"314"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=314, getCount=314}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-4611686018427387903"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387903, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-238"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:4>", "-1", "93"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "-1073741638", "156"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "157", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"0x\"2345k6789", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-1048574"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1048574, getCount=-1048574}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"2251799813685341"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "47"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2251799813685294, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-2"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"156", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-156"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"62"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=62, getCount=62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "344"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"229"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-229, getCount=-229}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "219"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"188"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-67109021"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-67109209, getCount=-67109209}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"92"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=92, getCount=92}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"119"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=119, getCount=119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"deflatd", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "60"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=60, getCount=60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"12:20:45", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"186"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-186, getCount=-186}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "217", "239"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-524193"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("524193", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524193, getCount=524193}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "67108744"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:3>", "184", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=67108744, getCount=67108744}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "242"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775566, getCount=-242}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-134217644"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-134217644, getCount=-134217644}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-2143"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2143", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2143, getCount=-2143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"8347"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8347, getCount=8347}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4253"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4253, getCount=4253}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427387906"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387906, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "154"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-154, getCount=-154}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "121", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=95, getCount=95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1048671"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1048671, getCount=1048671}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "43"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=43, getCount=43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"2"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-67043110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-67043110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-67043110, getCount=-67043110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "119"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=119, getCount=119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:4>", "-2147483648", "-2147483648"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-268435335"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-268435335", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-268435335, getCount=-268435335}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1099511628088"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1099511628088, getCount=-312}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-562949953421192"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("562949953421192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=562949953421192, getCount=-120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "0"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-155"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-155, getCount=-155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "5", "59"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "436"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147484084, getCount=2147483212}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775783"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387880, getCount=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "218"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "312"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=218, getCount=218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"46"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=46, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483584"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-94", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483584, getCount=-2147483584}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "209"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=209, getCount=209}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"344"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "8388796"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=344, getCount=344}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "209"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=209, getCount=209}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "sn7ppy-framed", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "0"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "77"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=77, getCount=77}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "69"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=69, getCount=69}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"156"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-156, getCount=-156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"156"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "224"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("224", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=224, getCount=224}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-54"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-54", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-54, getCount=-54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"190"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=188, getCount=188}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-524098"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524098, getCount=524098}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-218"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("218", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=218, getCount=218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"238"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=238, getCount=238}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"94"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "108"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-108, getCount=-108}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "156", "314"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "131191"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "8796093022254"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8796093022254", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8796093022254, getCount=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"75"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=75, getCount=75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-27", "38"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-576460751229681571"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:5>", "219"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-189"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("189", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=189, getCount=189}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "2.5", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "97"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-97", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-97, getCount=-97}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"191"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-191, getCount=-191}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"pack200", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "47"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-47, getCount=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "18014398509481829"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-18014398509481829, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "140737488355500"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("172", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=140737488355500, getCount=172}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "190"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("190", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=190, getCount=190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"136"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "120"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=256, getCount=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "1073741980"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741980", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1073741980, getCount=1073741980}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "268435461"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "103"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("268435564", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=268435564, getCount=268435564}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"21"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "16777218"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=16777239, getCount=16777239}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "119"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-119, getCount=-119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"120"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-120, getCount=-120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "155"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-2"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"bip2", "<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"94"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "1.12345c7", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b</a>PT1H", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "524408"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=524408, getCount=524408}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"109"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-153"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-44, getCount=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "[1,2]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1048670"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1048670", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1048670, getCount=1048670}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-95"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-95, getCount=-95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"deflate", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 1), new String[][]{{"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", actual.getClass().getName());
  assertEquals("{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"72057594037928066"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=72057594037928066, getCount=130}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "288230376151711744"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-288230376151711744", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-288230376151711744, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"184"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-256"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=184, getCount=184}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"h", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "xz", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "268435673", "-65"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-72"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=72, getCount=72}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-33554431"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554431", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=33554431, getCount=33554431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"a-0.0", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:3>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "-,11", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "224"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=115, getCount=115}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"54"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=54, getCount=54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"00x1F010", "<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "20"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "101"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=101, getCount=101}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=121, getCount=121}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "18014398509482180"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("196", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=18014398509482180, getCount=196}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "0x1Fgz", "<sample:4>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "deflate", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "155"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-155, getCount=-155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "231"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-231", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-231, getCount=-231}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "131227", "119"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "121"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-121, getCount=-121}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"gz", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "1.5f", "<sample:4>"}}), new String[][]{{"finish", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"deflate", "<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "219"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("219", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=219, getCount=219}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "436"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=436, getCount=436}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-148"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=148, getCount=148}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2204"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2204, getCount=2204}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-134"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=134, getCount=134}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<null>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "bzip2", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "wz", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"12 30:45\t", "<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "119"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "156"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=275, getCount=275}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-217"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-217, getCount=-217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-33554355", "174"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "120"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=120, getCount=120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"bzip2", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "1.12345678", "<sample:7>"}}), new String[][]{{"getBlockSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("109", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=109, getCount=109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"78"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"xz", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:7>", "109", "0"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-8191"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8191", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-8191, getCount=-8191}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "34359738445"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34359738445", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=34359738445, getCount=77}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "115"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=115, getCount=115}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-9223372036720558080"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=9223372036720558080, getCount=-134217728}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "16541", "121"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "2097152"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "217"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=217, getCount=217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "272"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "157"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("157", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=157, getCount=157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-109"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("109", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=109, getCount=109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "93"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("93", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=93, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "93"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-217"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-217, getCount=-217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-120"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-2147483430"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483310, getCount=2147483310}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1073741980", "-16"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "218"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-218, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"deflate", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-156"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-156, getCount=-156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "131289"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("131289", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=131289, getCount=131289}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2147483695"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483695", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483695, getCount=2147483601}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-28"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=28, getCount=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "102"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "118"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("118", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=118, getCount=118}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"47"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "93"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("93", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=93, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-121"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-121, getCount=-121}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"deflate", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}), new String[][]{{"getBytesRead", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-3879"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3879", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-3879, getCount=-3879}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "8388701"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388701", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8388701, getCount=8388701}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "8300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854767508, getCount=8300}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "235"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-235", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-235, getCount=-235}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "100"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=100, getCount=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "156"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-156, getCount=-156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-3939"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3939", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=3939, getCount=3939}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-156"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-156, getCount=-156}", SearchInputFactory_scaffolding.receiverState());
 }
}
