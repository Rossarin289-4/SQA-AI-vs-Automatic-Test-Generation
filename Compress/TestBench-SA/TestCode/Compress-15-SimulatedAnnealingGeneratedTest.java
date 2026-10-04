package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "15"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#549655996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#306#-2058334257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "1.1234567890123L4567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234567890123L4567 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#322#-42124684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"61"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=3997697, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#294#-1528269565", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "/", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#278#1350773163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"<null>", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#304#270143274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<s:\t2>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-9223372036854775800"}}, 3), new String[][]{{"addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "6"}, {"getLastModifiedDate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 05:53:16 PDT 2026 {getDate=3, getDay=6, getHours=5, getMinutes=53, getMonth=9, getSeconds=16, getTime=1791031996408, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMetho...#304#1593564224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String", "\010"}}, 3), new String[][]{{"addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "3"}, {"getCompressedSize", "", "5"}, {"setExtra", "byte[]", "3"}, {"setExternalAttributes", "long", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("\010 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#292#775047995", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\010 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#192245013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-52"}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-52, getLocalFileDataExtra=[], getMe...#302#-138486663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-16"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1048560", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-1048560, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#307#957740196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"4"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#508236043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#2100432903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#285#1710268545", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#294#2079244837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-2147221503"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#306#-2058334257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"1073741823"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#306#723536035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"32774"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2147090431, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#299#865926415", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=2147483647, getLocalFileDataExtra=[], g...#293#62224774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"2147483589"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=2147483589, getLocalFileDataExtra=[], g...#293#1023948803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"2147483526"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=2147483526, getLocalFileDataExtra=[], g...#293#1185052038", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"2147483526"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=2147483526, getLocalFileDataExtra=[],...#295#564955585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"1073741763"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=1073741763, getLocalFileDataExtra=[],...#295#1770583440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-2147483393"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "-16"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-1048576, getExtra=null, getExtraFields=[], getInternalAttributes=-2147483393, getLocalFileDataE...#307#-1163094085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<null>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:7>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#281#-1977875766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#281#-1977875766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#292#-590507604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<empty>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=2147483647, getLocalFileDataExtra=?, getMe...#301#-192309644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=2147483647, getLocalFileDataExtra=?, getMe...#289#-1029916306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=1073741823, getLocalFileDataExtra=?, getMe...#289#-542385126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "104"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "104"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#299#-1331647169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#287#1269026105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMeth...#288#950966261", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMethod...#286#1427738640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-1"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-1, getLocalFileDataExtra=[], getMethod...#297#-24090108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "16"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-1733463786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "47"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#882909812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "47"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#288#1837720574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#1126607775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#-125705143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-745802593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-50557025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1535", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-949192555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843205", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#226805533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-340597081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"-268435452"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"13"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#-395156155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2097101"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#303#142426221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#2100432903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"128"}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#299#-308778674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-341768343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#508236043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 0, 3, 0, 4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#352#49912298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 0, 3, 0, 4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#340#1548219456", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e300", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#299#-1294896133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"2.5e300", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2.5e300 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#299#-597580547", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"2.5e3/0", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2.5e3/0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#299#-2047873217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"2.55e3/0", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2.55e3/0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], g...#301#-1858438847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"4"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#297#508236043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#306#-2058334257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65537, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#289#-1908195053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=1, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#944478813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=131073, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#290#-1852220829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"-4094"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-268304383, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ...#298#549520157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=196609, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#290#301852270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"16"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "16 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#289#1780101635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String"}, new String[]{"<6"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setMethod", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<6 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#289#673356387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{" - ", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " -  {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMet...#291#535960469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{" - ", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " -  {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-142431334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{" -\037", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " -\037 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-1130881960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{" -\n", "<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " -\n {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#289#-413508626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=1, getLocalFileDataExtra=[], getMethod=...#296#-2147285213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=4, getLocalFileDataExtra=[], getMethod=...#296#2098628838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"4"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=4, getLocalFileDataExtra=[], getMethod=...#284#-1683390660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", new String[]{"int"}, new String[]{"-4"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-4, getLocalFileDataExtra=[], getMethod...#285#-109175743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:4>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"16"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-1807106102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"62"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-1272814829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-62"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#-1338532664", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-124"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#635159145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"-61"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#287#592086441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", new String[]{"int"}, new String[]{"2097101"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", "java.lang.String,byte[]", "invalid entry size", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "invalid entry size {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataE...#333#-1011569433", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#-125705143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#1126607775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setName", new String[]{"java.lang.String", "byte[]"}, new String[]{"010", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "010 {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1...#283#1908714147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMethod...#285#-971009345", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMeth...#287#1699942906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "-2"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMethod...#297#-1472096955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=-2, getLocalFileDataExtra=[], getMeth...#299#1515313280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "65534"}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=65534, getLocalFileDataExtra=[], getMet...#300#-447356887", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=65534, getLocalFileDataExtra=[], getM...#302#1473613582", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "65534"}}), new String[][]{{"setGeneralPurposeBit", "org.apache.commons.compress.archivers.zip.GeneralPurposeBit", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals(" {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=65534, getLocalFileDataExtra=[], getMeth...#287#1731226755", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=65534, getLocalFileDataExtra=[], getMe...#289#2117747496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getInternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#284#-1717482028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLocalFileDataExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"usesUTF8ForNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 1), new String[][]{{"usesUTF8ForNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.GeneralPurposeBit", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 1), new String[][]{{"usesUTF8ForNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"usesUTF8ForNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "65534"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}), new String[][]{{"usesUTF8ForNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=65534, getLocalFileDataExtra=[], getM...#290#-904700188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}), new String[][]{{"usesUTF8ForNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"usesUTF8ForNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"usesUTF8ForNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "3"}}), new String[][]{{"usesUTF8ForNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=3, getLocalFileDataExtra=[], getMetho...#298#317867786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "6"}}, 3), new String[][]{{"usesEncryption", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=6, getLocalFileDataExtra=[], getMetho...#286#-1843775965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "6"}}, 3), new String[][]{{"usesEncryption", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=6, getLocalFileDataExtra=[], getMetho...#298#268814541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setInternalAttributes", "int", "6"}}, 3), new String[][]{{"usesEncryption", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=6, getLocalFileDataExtra=[], getMethod...#285#1405969127", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-33>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-9223372036854775808, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileData...#304#-1576754065", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#315#31227557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#326#-1922988367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoc...#314#-1165121273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getRawName", new String[]{}, new String[]{}, false, 45, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=?, getInternalAttributes=0, getLoca...#313#642259531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false), new String[][]{{"setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "1"}, {"getExtraFields", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.compress.archivers.zip.ZipExtraField;", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}), new String[][]{{"setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#291#674381126", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}), new String[][]{{"setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("0/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1,...#294#1130214862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getLastModifiedDate", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", ""}}), new String[][]{{"setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", actual.getClass().getName());
  assertEquals("sample/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMetho...#304#1593564224", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnixMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setUnixMode", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=65537, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#289#-1908195053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraField", "org.apache.commons.compress.archivers.zip.ZipShort", "<sample:1>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:5>"}}), new String[][]{{"getInternalAttributes", "", "5"}, {"getMethod", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[3, 0, 3, 0, 4, 5, 6], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[3, 0, 3, 0, 4, 5, 6], getExtraFields=?, getInternalAttributes=0,...#352#49912298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:0>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=!ArrayIndexOutOfBoundsException, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=?, getInternalAttributes=0, getLocal...#324#448770550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod...#291#674381126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, ...#280#-1948420094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1,...#294#1130214862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addExtraField", "org.apache.commons.compress.archivers.zip.ZipExtraField", "<sample:3>"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMetho...#304#1593564224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036821221375"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036821221375, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExt...#301#-1596363980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExt...#301#735816330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExt...#301#735816330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=9223372036854775807, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataEx...#303#-359940538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-1639169419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-1639169419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-9223372036854775807"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-2, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#-798090725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExternalAttributes", "long", "-137438953445"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getPlatform", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=-137438953445, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[],...#295#2018085757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", "byte[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setPlatform", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#1939763443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#322#1033166600", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#358#24408578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[5, 0, 5, 0, 6, 7, 0, 0, 0], getExtraFields=?, getInternalA...#370#570133548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#334#-1885621966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[-2, -54, 0, 0], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[-2, -54, 0, 0], getExtraFields=?, getInternalAttributes=0, getLocalFil...#334#-1885621966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "addAsFirstExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipExtraField"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setCentralDirectoryExtra", "byte[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#287#1882684751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#298#366921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMetho...#286#-134309475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getUnparseableExtraFieldData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtraFields", "org.apache.commons.compress.archivers.zip.ZipExtraField[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=?, getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=?, getExtraFields=?, getInternalAttributes=0, getLocalFileDataExtra=?, getMethod=-1, g...#279#-330397306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"130"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#-882312977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"189"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#1117215635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"189"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#286#1117215635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"65535"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#-1871288999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"65488"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#-86203210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"64464"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#288#-871138411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", new String[]{"long"}, new String[]{"-65488"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeExtraField", new String[]{"org.apache.commons.compress.archivers.zip.ZipShort"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3), new String[][]{{"getCreationTime", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", ""}}, 3), new String[][]{{"getCreationTime", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#285#651138516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getCentralDirectoryExtra", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "removeUnparseableExtraFieldData", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMe...#295#29306236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#298#-622900648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getM...#308#-1881636618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#296#-699278366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=-...#283#2026951996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "isDirectory", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#887909432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#295#-1481151692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#284#280139390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setExtra", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getMethod", ""}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "setSize", "long", "0"}, {"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExtraFields", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=[], getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod=...#283#1866984146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getGeneralPurposeBit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}}), new String[][]{{"encode", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMethod...#285#-1179531679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], get...#297#-484286111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], getMeth...#300#-456566381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "getExternalAttributes", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample/ {getCentralDirectoryExtra=[], getComment=null, getCompressedSize=-1, getCrc=-1, getExternalAttributes=0, getExtra=null, getExtraFields=[], getInternalAttributes=0, getLocalFileDataExtra=[], ge...#310#719431707", SearchInputFactory_scaffolding.receiverState());
 }
}
