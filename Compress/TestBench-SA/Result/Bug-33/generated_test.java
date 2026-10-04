package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "null", "<null>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "5.", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", ".1.5", "<sample:3>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:3>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "+1", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "xz", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "deflate", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<null>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "z", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "1.12345678901234567", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "<null>", "<sample:1>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "0xFFFFFFFF", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"bzip2", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"bzip2", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", ".145", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"xz", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "\t", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "pack200", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"pack200", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", ".5", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "i", "<empty>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "deflate", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"lzma", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"snappy-framed", "<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b<.>=", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "2", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"snappy-raw", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "2020-02-30T25:61:61", "<sample:8>"}}), new String[][]{{"read", "byte[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"gz", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "gz", "<sample:2>"}}, 2), new String[][]{{"finish", "", "2"}, {"close", "", "1"}, {"close", "", "4"}, {"write", "byte[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"217"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "218"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-72057594037927068"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-72057594037927068"}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-76526009297387606"}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b</a>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b</a", "<sample:1>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "5.", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "5.", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "xz", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"0xFFFFFFFG", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"1073745913"}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<empty>", "219", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1073745914, getCount=1073745914}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-76526009297387606"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4178006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=76526009297387606, getCount=4178006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "93", "157"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "627", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "121"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "95"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "{", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-434"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-435, getCount=-435}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"434"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=433, getCount=433}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"434"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1025"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-591, getCount=-591}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"217"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1025"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-808, getCount=-808}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"430"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1025"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-595, getCount=-595}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"-1.5", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "+11", "<sample:1>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"1.1234567890123456", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"157"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=157, getCount=157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "93"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"J", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "-1", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"", "<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"119"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-119"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "119", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4294967294, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483647"}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-95"}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483552, getCount=2147483552}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-190"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483457, getCount=2147483457}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"119"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "157"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=119, getCount=119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"288230376151711863"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "157"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151711863, getCount=119}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"288230376134934647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376134934647, getCount=-16777097}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"288230376134934668"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376134934668, getCount=-16777076}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"288230651012841612"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230651012841612, getCount=-16777076}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "93", "119"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"72339069081746588"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775808"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9151032967773029220, getCount=-67107996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"72339069081746588"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-72339069081746588, getCount=-67107996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"36169534540873294"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-36169534540873294, getCount=-33553998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"18084767270436643"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-18084767270436643, getCount=-16776995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"94"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-94, getCount=-94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "217"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-10"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9, getCount=-9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-10"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "119"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=110, getCount=110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "119"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=120, getCount=120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "119"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=214, getCount=214}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "93"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=93, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-2199023255238"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "2020-02-30T25:61:61", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "120"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=120, getCount=120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "178"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=178, getCount=178}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-156, getCount=-156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-134217572"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217572", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=134217572, getCount=134217572}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-134217572"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2013266076", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2013266076, getCount=-2013266076}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "217"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483430", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686016279904474, getCount=-2147483430}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"18014398526258983"}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686020574871770"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-76526009297387606"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4177996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-76526009297387596, getCount=-4177996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"4611686018427388122"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427388122, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"<a>b</a>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{".5", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{".5", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "http://example.com/a?b=c", "<empty>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{".5", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "http://example.com/a?b=c", "<empty>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<empty>", "-1", "217"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"q", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "+1", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-76526009297387606"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"268435466"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=268435466, getCount=268435466}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"134217733"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=134217733, getCount=134217733}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"134217672"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=134217672, getCount=134217672}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "null", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", ".145", "<sample:3>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "2020-01-01", "<null>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "xz", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"0xFFFFFFFF", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"0xFFFFFFFF", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"219"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "95"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=124, getCount=124}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"-1.5", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "snappy-raw", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "93", "157"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "628", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<empty>", "218", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "550"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"156"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9223372036854775807, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"8935141660703064063"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8935141660703064063, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"4467570830351532031"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4467570830351532031, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"4467570830351532004"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=4467570830351532004, getCount=-28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"120"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-120, getCount=-120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"60"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-60, getCount=-60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-9007199254741052"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9007199254741052, getCount=60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "156"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "gz", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-155"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "<null>", "<sample:1>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "0xFFFFFFFF", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"8796093022124"}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "121", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388122, getCount=218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686018427388122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427388122, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "155"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "119", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=155, getCount=155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "138"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "119", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=138, getCount=138}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "157"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=157, getCount=157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "78"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=78, getCount=78}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "217"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-217, getCount=-217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "218"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-218, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "1242"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1242, getCount=-1242}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "156"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "10", "157"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "217"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "217"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=217, getCount=217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "157", "2"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483623"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483623", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483623, getCount=2147483623}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "219", "119"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-1, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"-50"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-52, getCount=-52}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"50"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483697, getCount=-2147483599}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"1"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"8589934568"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=8589934568, getCount=-24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "513"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "-16777123"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"156"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "120"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-120, getCount=-120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"/", "<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-1152921504606846974"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606846974, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-1152921504606846974"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("157", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606846819, getCount=157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-1152921504606838782"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8349", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606838627, getCount=8349}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "10"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-1152921504606838782"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "155"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8359", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-1152921504606838617, getCount=8359}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-68719476736"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-68719476736, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "68719476736"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=68719476736, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-72057594037927068"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("868", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-72057594037927068, getCount=868}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"deflate", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686018427388001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427388001, getCount=-97}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686018427387937"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387937, getCount=-33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"{\"a\":1\n-1.5", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "gz", "<sample:8>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b</a>>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.compress.compressors.CompressorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "95"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("94", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "157"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("251", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=251, getCount=251}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "95"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-72057594037927068"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("962", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-72057594037926974, getCount=962}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-95", "50"}, false, 13, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "219", "218"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-121, getCount=-121}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "95", "218"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "218"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-218", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-218, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-2147483648"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<empty>", "218", "10"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "78", "1073741826"}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"bzip2", "<sample:6>"}, false, 7, new String[][]{}, 3), new String[][]{{"close", "", "5"}, {"finish", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "93"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("93", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=93, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"9007199254707057"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-134217635"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=9007199120489422, getCount=-134251570}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"long"}, new String[]{"312"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "-134217635"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-134217323, getCount=-134217323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "4194092", "139"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "155"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "47"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-155", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-155, getCount=-155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427388122"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<empty>", "181"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=1, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-288230376151711745"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151711745, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-288230376151711745"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151711866, getCount=122}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-288230376151719937"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151720058, getCount=8314}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-288230376151719963"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=288230376151720084, getCount=8340}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "217"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-217, getCount=-217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "93"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=93, getCount=93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "218"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "93"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=311, getCount=311}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-76526009297387606"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<null>", "-1", "276"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-7"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-7"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=7, getCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "93"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-93", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-93, getCount=-93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "95"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=95, getCount=95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "121", "60"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "157"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "121", "60"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=157, getCount=157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "121"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "218"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("339", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=339, getCount=339}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "155"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2, getCount=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=20, getCount=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "10", "-1"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-72057594037927068"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"155"}, false, 8, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483648", "219"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "218"}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387606"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "157"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-157, getCount=-157}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "151"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-151, getCount=-151}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "155"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "219"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-64, getCount=-64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"deflate", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b<.>=", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", actual.getClass().getName());
  assertEquals("{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"deflate", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "<a>b<.>=", "<sample:2>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "false"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", ""}}), new String[][]{{"read", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=10, getCount=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775799, getCount=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "9223372036854775807"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=2, getCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-2147483648, getCount=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-76526009297387606"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=76526009297387606, getCount=4178006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-76526009297387624"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=76526009297387624, getCount=4178024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", new String[]{"java.lang.String", "java.io.OutputStream"}, new String[]{"z#a\";_;--\n\n-1.6", "<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=94, getCount=94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:2>", "0", "137"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "4611686018427388122"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427388122, getCount=-218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", "byte[],int,int", "<sample:1>", "0", "137"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775807, getCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.3IxFEFFFFFF", "<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorOutputStream", "java.lang.String,java.io.OutputStream", "2147483648", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.io.InputStream", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"154"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.zip.ZipException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "available", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=0, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.CompressorStreamFactory", "org.apache.commons.compress.compressors.CompressorStreamFactory", "getDecompressConcatenated", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "0x123456789", "<null>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "createCompressorInputStream", "java.lang.String,java.io.InputStream", "Mark is not supported.", "<sample:0>"}, {"org.apache.commons.compress.compressors.CompressorStreamFactory", "setDecompressConcatenated", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=2147483647, getCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "matches", new String[]{"byte[]", "int"}, new String[]{"<null>", "1205862442"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "int", "120"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=120, getCount=120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427388122", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388122, getCount=218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427388122", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388122, getCount=218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388144"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427388144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388144, getCount=240}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427388144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388144, getCount=240}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387606"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686018427387904"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387606"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-4611686018427387904"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "93"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387997, getCount=-93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "93"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-93", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-93, getCount=-93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387811"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387811", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387811, getCount=-93}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387811"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387967", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387967, getCount=63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387767"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387767, getCount=-137}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getBytesRead", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "-76526009297387629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "95"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-95, getCount=-95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-68719476618"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-118", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=68719476618, getCount=-118}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"155"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-155, getCount=-155}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"155"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-76526009297387606"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-76526009297387761, getCount=-4178161}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-155"}, false, 3, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-76526009297387606"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-76526009297387451, getCount=-4177851}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", new String[]{"long"}, new String[]{"-310"}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "-76526009297387606"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-76526009297387296, getCount=-4177696}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-9223372036854775808"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-9223372036854775808, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387904"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427387904, getCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387904"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387905, getCount=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387904"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=217, getCount=217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427396314"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "9223372036854775807"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-4611686018427387904"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8409", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=8409, getCount=8409}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "2199023255564"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "94"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("82", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-2199023255470, getCount=82}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "65629"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "94"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=-94, getCount=-94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "-137438953378"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBytesRead=137438953378, getCount=-94}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "94"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "156"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=156, getCount=156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "skip", "long", "22"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "60"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-60, getCount=-60}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "92"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-92", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-92, getCount=-92}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388122"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "92"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("126", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388030, getCount=126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388126"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "92"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("130", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388034, getCount=130}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388126"}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "pushedBackBytes", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("223", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=-4611686018427387681, getCount=223}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "getCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "close", ""}, {"org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream", "count", "long", "4611686018427388126"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("222", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBytesRead=4611686018427388126, getCount=222}", SearchInputFactory_scaffolding.receiverState());
 }
}
