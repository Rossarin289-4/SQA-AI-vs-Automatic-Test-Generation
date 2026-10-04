package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.zip.DeflaterOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>"}, true), new String[][]{{"write", "byte[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:2>", "<sample:1>"}, true), new String[][]{{"write", "byte[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.tukaani.xz.LZMA2OutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:6>", "<sample:1>"}, true), new String[][]{{"writeBytes", "byte[]", "1"}, {"close", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals("\000\u007f {size=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<null>", "<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<empty>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:3>", "<sample:6>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:4>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:6>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:6>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:2>", "<sample:9>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:0>", "<null>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:2>", "<null>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:2>", "<null>"}, true, 0, null, 2), new String[][]{{"write", "byte[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.tukaani.xz.LZMA2OutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:3>", "<null>"}, true, 0, null, 2), new String[][]{{"write", "byte[]", "1"}, {"write", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.zip.DeflaterOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:6>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"write", "byte[]", "1"}, {"writeTo", "java.io.OutputStream", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals("\000\u007f {size=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:1>", "<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:4>"}, true), new String[][]{{"write", "byte[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:0>", "<sample:9>", "<empty>"}, true, 0, null, 3), new String[][]{{"write", "byte[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:1>", "<sample:9>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.zip.DeflaterOutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, true), new String[][]{{"toByteArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addDecoder", new String[]{"java.io.InputStream", "org.apache.commons.compress.archivers.sevenz.Coder", "byte[]"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:4>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:4>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<empty>", "<sample:0>", "<sample:0>"}, true), new String[][]{{"write", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals("\004\005\006 {size=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, true), new String[][]{{"write", "byte[]", "0"}, {"flush", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals("\ufffd {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:4>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:0>", "<sample:4>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", actual.getClass().getName());
  assertEquals("{getBlockSize=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<null>", "<sample:6>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"flush", "", "5"}, {"close", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.tukaani.xz.LZMA2OutputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:3>", "<sample:6>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"writeBytes", "byte[]", "1"}, {"writeTo", "java.io.OutputStream", "5"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:2>", "<sample:2>", "<empty>"}, true, 0, null, 1), new String[][]{{"flush", "", "1"}, {"finish", "", "5"}, {"write", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.Coders", "org.apache.commons.compress.archivers.sevenz.Coders", "addEncoder", new String[]{"java.io.OutputStream", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "byte[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
