package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "14"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-322944695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-510"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#341#822223994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.123456789h1234567", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", "int", "20509"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.123456789h1234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataEx...#319#-1132299510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#1434102005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-494"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3), new String[][]{{"addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "5"}, {"setComment", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=0, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ge...#336#-480414448", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "511"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#322#-1754829862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", "int", "494"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"61456"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#1364426650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "16343"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16343", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1071054848, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#291#181146280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFi...#335#1143898552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#320#-2026793933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"12345678901234567890H234567890", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "81920"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "12345678901234567890H234567890 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1073741841, getExtra=null, getExtraFields=[], getInternalAttributes...#362#1483032705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "40961"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-1610547183, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[]...#307#-1676140629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"toGMTString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("31 Dec 1969 23:59:59 GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getLastModifiedTime", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#356#-5532039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"421"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=27590656, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#292#-1115160449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#356#-5532039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "4095"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#264097866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"421"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=421, getLocalFileDataExtra=[], getMet...#288#-51423725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getExtraFiel...#385#-534455376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"1114112"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1114112, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#290#1834117181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#290#191973275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "40"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-941479440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483648, getLocalFileDataExtra=[]...#296#428267770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "-2147483648"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#296#-260960168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#358#907082037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalAt...#356#-5532039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1234567890123445678901234567890", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1234567890123445678901234567890 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getL...#353#69586648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#290#-558551303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"usesUTF8ForNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#279824722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#339#418640405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "1.4e300", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.4e300 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#302#-733697700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "30"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0...#353#-1078215056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "8388659"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "5.", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#279#-1633817069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", "int", "30720"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#1946938829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoca...#312#-1113776812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-16384"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:a_>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#302#-983442062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-1099511668737"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"compareTo", "java.util.Date", "4"}, {"setMinutes", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 08 13:52:00 PST 2114 {getDate=8, getDay=2, getHours=13, getMinutes=52, getMonth=0, getSeconds=0, getTime=-128847895680000, getTimezoneOffset=480, getYear=214}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"131068"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#302#1522537356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#1946938829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", "int", "-511"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"{\"a\":", "<null>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"a\": {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#294#1450362764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#-974943061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1\t", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1\t {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#292#1653149077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", new String[]{"int"}, new String[]{"-4132864"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "61439"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=61439, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#-300866940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"1099511668737"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "246"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=16121856, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#303#-1486870666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#1434102005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{",-1", "<empty>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", ",-1 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#288#1211802453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "32768"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#1498349128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"9007199254806527"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#300#-2118703302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"16793559"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=16793559, getLocalFileDataExtra=[], g...#292#-1328771597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", new String[]{"int"}, new String[]{"61472"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#286#-1828115449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-40960"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-7"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-61440"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483648, getLocalFileDataExtra=[]...#307#2013231983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "246"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-458765118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"492"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#-1447418219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:udy>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "8190"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("536739840", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=536739840, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#292#-169866272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#284#-1022890286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#1434102005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#321#679120461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "8191"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#296#-121823050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "--1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#1861086591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234567 {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, get...#337#-1526956807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getExtraFiel...#384#-1310742474", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#319#-2103204697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"z1http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "z1http://example.com/a?b=c {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalF...#336#-1395365538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#282#1525656621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"4123"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=4123, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#288#1895666320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "1020"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#309#1833401561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", new String[]{"int"}, new String[]{"838"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"511"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=33488912, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#306#645451558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-65536, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#289#-1905502071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#279#-1633817069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"8196"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=8196, getLocalFileDataExtra=[], getMet...#287#1408576466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-32"}}), new String[][]{{"getComment", "", "0"}, {"getComment", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#-2062060996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "\rull"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\rull {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocal...#328#-1172553421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"before", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, g...#324#221456084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "17592186105857"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=17592186105857, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra...#298#1818812125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getRawFlag", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Title {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#294#-659195584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"1.12345678911234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.12345678911234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#322#513669370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#340#-532648525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "510"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=510, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#298#-888700318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", "int", "65536"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#1434102005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", new String[]{"int"}, new String[]{"65580"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#300#1941272220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getLastModifiedDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"1.123456789h12345671.5"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.123456789h12345671.5 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileD...#339#815486381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"PH"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "8388659"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PH {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#294#-1417067635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", new String[]{"int"}, new String[]{"4210689"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", "int", "81947"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0, 5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0, 5, 0, 5, 0, 6, 7, 0, 0, 0], ...#402#-1309878744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "388"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#49930561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-8388557"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=3342337, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#291#1432766206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoca...#312#-1113776812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false), new String[][]{{"clone", "", "2"}, {"getTimeLocal", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.time.DateTimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "122878"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=122878, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#290#-1836962790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"4503599629468142"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-1915799047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "0T2H"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0T2H {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#291#399161160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.1234567890234567", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234567890234567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#318#1384035422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-40"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=-40, getLocalFileDataExtra=?, getMethod=-1,...#280#1486309938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0, ...#338#-872288709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}}), new String[][]{{"useUTF8ForNames", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#296#-1150116994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#283#1499604616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-4156"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-4156, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#289#1224663923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}), new String[][]{{"isDirectory", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"useEncryption", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "549755846672"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=549755846672, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[]...#295#1611411726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}}), new String[][]{{"setLastModifiedTime", "java.nio.file.attribute.FileTime", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#308#-1791055865", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#290#-558551303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawFlag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#1946938829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:4>"}}), new String[][]{{"setTime", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6, -2, -54, 0, 0], getExtraFiel...#385#-534455376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "2251799813685286"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=2251799813685286, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields...#386#-1247923486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setRawFlag", "int", "-61486"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#289#-14638352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-61439"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=268500993, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#292#1422108099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "true {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes...#346#45279739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "2468"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#284#-1317308829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#-243254375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"16383"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#1526053367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"16383"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=16383, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#301#-104027886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#1946938829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"/", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1669309525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:5>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#1434102005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "16383"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#261601227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"8388659"}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#302#253012813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", new String[]{"org.apache.commons.compress.archivers.zip.GeneralPurposeBit"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#294#944660483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-512"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-512, getLocalFileDataExtra=[], getMe...#288#-355025289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#320#-2026793933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#357#-46156781", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#357#-46156781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"16352"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#287#-1007033310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#320#-2026793933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"usesUTF8ForNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#299#1946938829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionRequired", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "4/960", "<empty>"}}), new String[][]{{"encode", "byte[],int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#279#-1633817069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getVersionMadeBy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#295#1800562078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", new String[]{"int"}, new String[]{"65590"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "-1073742844"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"1022"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#124064893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=10, getLocalFileDataExtra=[], getMeth...#286#1149569505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#279#-1633817069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"59"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#985582616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "-2147483648"}}), new String[][]{{"isDirectory", "", "3"}, {"getSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#294#79724968", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#305#1079292668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#-1990939368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", new String[]{"int"}, new String[]{"22"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "536871309"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#293#2105344390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", new String[]{"int"}, new String[]{"32770"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-1905047088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionRequired", new String[]{"int"}, new String[]{"-10"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}}), new String[][]{{"usesEncryption", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-756902274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "40"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=2621441, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#290#102673951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFile...#320#-2026793933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:10>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "4094"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#-1303961584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setVersionMadeBy", new String[]{"int"}, new String[]{"575"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "16383"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=16383, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#289#1378803473", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isUnixSymlink", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#295#1800562078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.123456789012A4567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.123456789012A4567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataEx...#319#1926821999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#-295396579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#282#-930561981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#278#-1145152839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "251"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=251, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#298#-475661540", SearchInputFactory_scaffolding.receiverState());
 }
}
