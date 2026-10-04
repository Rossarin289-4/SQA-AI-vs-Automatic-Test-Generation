package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"19"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "-1073741824"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:5>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<null>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "42"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "8192"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147352575"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:T>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"allocNameCopyBuffer", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 2), new String[][]{{"contentsAsDouble", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 2), new String[][]{{"getCurrentSegmentSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2113929216"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<s:tT>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<s:S>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "32731"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"1074266112"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "2147483643"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2046820352"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2113927168"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:4>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:5>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "2147483636"}, {"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"134217727"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:kfy>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:12>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 1), new String[][]{{"withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2113929216"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<i:-131072>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"28"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "-1074266112"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-2147483648"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:U>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false), new String[][]{{"getCurrentSegment", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2097152"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-16777267"}}), new String[][]{{"getEncoding", "", "2"}, {"releaseTokenBuffer", "char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:5>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false), new String[][]{{"allocConcatBuffer", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:4>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2147483602"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}), new String[][]{{"allocWriteEncodingBuffer", "int", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}), new String[][]{{"releaseConcatBuffer", "char[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"14"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:`>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-1073741826"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}), new String[][]{{"constructTextBuffer", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1074266112"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<s:ae>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:3>"}}, 1), new String[][]{{"allocNameCopyBuffer", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:3>"}}, 3), new String[][]{{"setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "-2097142"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "-1073741878"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-55"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"33"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "2147483646"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:0>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}}, 2), new String[][]{{"allocConcatBuffer", "", "4"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 2), new String[][]{{"resetWithShared", "char[],int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<null>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-2113798144"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-536870912"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-1040711680"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:keL>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2113929216"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "-67108863"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<empty>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:a9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1073741840"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "-2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1073741568"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "10"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false), new String[][]{{"getSourceReference", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:T>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "2147483647"}}), new String[][]{{"resetWithString", "java.lang.String", "0"}, {"append", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 1), new String[][]{{"allocReadIOBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "2147475455"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<i:-46>"}}, 1), new String[][]{{"releaseWriteEncodingBuffer", "byte[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-1074266112"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:2>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}), new String[][]{{"getCurrentSegment", "", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
