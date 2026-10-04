package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"49"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<null>", "<null>"}}, 2), new String[][]{{"allocTokenBuffer", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<null>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<null>"}}, 2), new String[][]{{"setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "0"}, {"constructTextBuffer", "", "4"}, {"append", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2147418112"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "0"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "0"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"allocTokenBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 12, new String[][]{}), new String[][]{{"allocTokenBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}), new String[][]{{"allocBase64Buffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}}), new String[][]{{"contentsAsArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<null>"}}), new String[][]{{"getSourceReference", "", "3"}, {"constructTextBuffer", "", "4"}, {"contentsAsString", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}), new String[][]{{"contentsAsDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<empty>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "-1"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}), new String[][]{{"allocReadIOBuffer", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:5>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", "char[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false), new String[][]{{"hasTextAsCharacters", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getSourceReference", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "262220"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "262220"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<empty>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"0"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "50"}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<empty>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "setEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:3>"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-63"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_BE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-63"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{"int"}, new String[]{"-5"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false), new String[][]{{"append", "java.lang.String,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-3"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-510"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-1003"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<s:;k2x>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "-2147483648"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-530"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"10"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<null>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "1"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<null>"}}), new String[][]{{"releaseNameCopyBuffer", "char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"allocTokenBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 8, new String[][]{}, 3), new String[][]{{"allocTokenBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:8>"}, false, 8, new String[][]{}, 3), new String[][]{{"allocTokenBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF32_BE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF32_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseNameCopyBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<null>", "<empty>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", new String[]{"char[]", "char[]"}, new String[]{"<sample:1>", "<empty>"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", "byte[]", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseReadIOBuffer", new String[]{"byte[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:7>"}, {"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "0"}}), new String[][]{{"resetWithShared", "char[],int,int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "0"}}, 1), new String[][]{{"resetWithShared", "char[],int,int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "0"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<empty>", "<sample:0>"}}, 1), new String[][]{{"resetWithShared", "char[],int,int", "5"}, {"expandCurrentSegment", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-2147483648"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseConcatBuffer", "char[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.TextBuffer", actual.getClass().getName());
  assertEquals(" {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "byte[],byte[]", "<sample:1>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "getEncoding", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocBase64Buffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseBase64Buffer", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"33554405"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}, 2), new String[][]{{"expandCurrentSegment", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocConcatBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "withEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyRelease", "char[],char[]", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.IOContext", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}, {"com.fasterxml.jackson.core.io.IOContext", "allocReadIOBuffer", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", new String[]{"char[]"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.io.IOContext", "getEncoding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-33554432"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-33554432"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", new String[]{"int"}, new String[]{"-33554446"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocNameCopyBuffer", "int", "2147483647"}, {"com.fasterxml.jackson.core.io.IOContext", "constructTextBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"-2"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{"int"}, new String[]{"2105302"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "_verifyAlloc", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "isResourceManaged", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "getSourceReference", ""}, {"com.fasterxml.jackson.core.io.IOContext", "releaseTokenBuffer", "char[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "releaseWriteEncodingBuffer", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 3), new String[][]{{"allocBase64Buffer", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 3), new String[][]{{"allocBase64Buffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF8, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 3), new String[][]{{"allocBase64Buffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=UTF16_LE, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "withEncoding", new String[]{"com.fasterxml.jackson.core.JsonEncoding"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "setEncoding", "com.fasterxml.jackson.core.JsonEncoding", "<sample:1>"}}, 3), new String[][]{{"allocBase64Buffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.io.IOContext", "com.fasterxml.jackson.core.io.IOContext", "allocTokenBuffer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.io.IOContext", "allocWriteEncodingBuffer", "int", "134217755"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEncoding=null, isResourceManaged=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
