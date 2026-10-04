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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "//b"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.124567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=0, getCrcValue=0, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=//b, getSize=0, getWindowsAttributes=0,...#253#1334790340", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:1>", "0", "4350"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "-"}, false), new String[][]{{"setCrcValue", "long", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=1, getCrcValue=1, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=-, getSize=0, getWindowsAttributes=0, h...#252#-372849712", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", new String[]{"org.apache.commons.compress.archivers.sevenz.SevenZMethod"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2042", "254"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "128"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", new String[]{"org.apache.commons.compress.archivers.sevenz.SevenZMethod"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:1>", "-1", "127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "0x123456789"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:6>", "-0P0"}}), new String[][]{{"getCrcValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "i"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=0, getCrcValue=0, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=i, getSize=0, getWindowsAttributes=0, h...#251#1681075965", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:1>", "1.124568"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-53"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<null>", "32", "2147483647"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "1e101E5"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-2147483616"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=0, getCrcValue=0, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=1e101E5, getSize=0, getWindowsAttribute...#257#-1160348648", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "nukl-1"}, false), new String[][]{{"getHasAccessDate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-31"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<null>", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "true1.5e30o0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "1-1234577"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-1073741823"}}, 3), new String[][]{{"isAntiItem", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483647", "32768"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"31"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "127"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"16777163"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:2>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", ""}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:1>", "32", "255"}}, 1), new String[][]{{"getCrc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"48"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:4>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "\u00e9http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:10>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:0>", "64", "512"}}), new String[][]{{"isDirectory", "", "7"}, {"setCrc", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=4, getCrcValue=4, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=\u00e9http://example.com/a?b=c, getSize=0, g...#276#1890629938", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:0>", "256", "-2147483648"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<empty>", "1073741823", "32"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"16"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-268435329"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", new String[]{"org.apache.commons.compress.archivers.sevenz.SevenZMethod"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"47"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:1>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "1.25Title"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:5>", "44", "-255"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=0, getCrcValue=0, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=1.25Title, getSize=0, getWindowsAttribu...#259#547853358", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "1048586"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "-1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"63"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<empty>", "1", "127"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "1.12345671.12334567890123456"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}), new String[][]{{"getAccessDate", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "127"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "54"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"20"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-31", "1"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1073741824", "1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "256"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "4128"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", new String[]{"org.apache.commons.compress.archivers.sevenz.SevenZMethod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "0"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<empty>", "1073741823", "232"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "42"}, false), new String[][]{{"getHasLastModifiedDate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-62"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "[1,2]"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:0>", "31", "31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "{\"a\":1}"}, false, 2, new String[][]{}, 2), new String[][]{{"isAntiItem", "", "4"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "127"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:4>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "\".5d"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 1), new String[][]{{"getCreationDate", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "TITLE1.5"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "<a</a>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:10>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}), new String[][]{{"setCrc", "int", "0"}, {"setName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=-2147483648, getCrcValue=-2147483648, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=sample, getSize=0, ...#277#-1900464545", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "71"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", "2147483648"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "0\nx1F"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 3), new String[][]{{"setCrc", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=2, getCrcValue=2, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=0\nx1F, getSize=0, getWindowsAttributes=...#256#-1081927914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"2145386495"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-536870912", "33"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "254"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "246", "0"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:5>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "15", "1"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "155"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<empty>", "2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "508", "82"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"1073741759"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:1>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:2>", "16777470", "254"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "31", "67108864"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:4>", "-53", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "244", "1074003967"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "\n"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:2>", "1.12345668"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 2), new String[][]{{"getCrcValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "125 "}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-254"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:3>"}}, 2), new String[][]{{"getHasWindowsAttributes", "", "0"}, {"setCrc", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", actual.getClass().getName());
  assertEquals("{getCrc=4, getCrcValue=4, getHasAccessDate=false, getHasCrc=false, getHasCreationDate=false, getHasLastModifiedDate=true, getHasWindowsAttributes=false, getName=125 , getSize=0, getWindowsAttributes=0...#255#327584801", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "77"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", " \n"}, false, 0, null, 3), new String[][]{{"getCreationDate", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "UTF,16LE"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:3>"}}, 2), new String[][]{{"getAccessDate", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "1.25265"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:0>", "00"}}, 1), new String[][]{{"setAccessDate", "java.util.Date", "2"}, {"getHasCreationDate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1024", "1048586"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:2>", "1", "223"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "11"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "2147483647"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:1>", "1048586", "-66"}}, 1), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:2>", "213", "255"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<null>", "255", "2097172"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "123456789012345678901234567890"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "1073741823"}}, 3), new String[][]{{"getWindowsAttributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-53", "33554479"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<null>", "1073741823", "38"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-258", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", "org.apache.commons.compress.archivers.ArchiveEntry", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ""}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:2>", "524235", "-1073741824"}}, 2), new String[][]{{"getCrc", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<empty>", "1.12345678901234561E-5"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:1>"}}, 3), new String[][]{{"getHasLastModifiedDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-32", "-1073741824"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "close", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<empty>", "63", "2147483647"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "finish", ""}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"1073741776"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", "java.io.File,java.lang.String", "<sample:3>", " "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "createArchiveEntry", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "1.12345678"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "2147483647"}}, 2), new String[][]{{"getHasCrc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<sample:3>", "256", "2147483647"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"int"}, new String[]{"31"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<null>", "-2147483648", "31"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "int", "-67108608"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "putArchiveEntry", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "setContentCompression", "org.apache.commons.compress.archivers.sevenz.SevenZMethod", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "write", "byte[],int,int", "<empty>", "33", "33"}, {"org.apache.commons.compress.archivers.sevenz.SevenZOutputFile", "closeArchiveEntry", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.tukaani.xz.XZIOException", thrown.getClass().getName());
 }
}
